package org.test;/*
package org.test;

import org.elasticsearch.common.settings.Settings;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;

*/

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 　  * @className: TestIK
 * 　　* @description:TODO
 * 　　* @param:
 * 　　* @return:
 * 　　* @throws:
 * 　　* @email lzz215855518@gmail.com
 * 　　* @author: lizz
 * 　　* @date: 2022/04/12 11:41
 */

public class TestIK {
    public static void main(String[] args) throws IOException {
        testIkSegment();
    }

    public static void testIkSegment() throws IOException {
        String t = "本草刚目";
        Settings settings = Settings.builder()
                .put("use_smart", false)
                .put("enable_lowercase", false)
                .put("enable_remote_dict", false)
                .put("path.home", "D:\\javaSource\\elasticsearch-analysis-ik\\config")
                .build();

        Path path = Paths.get("D:\\javaSource\\elasticsearch-analysis-ik\\config");
        Configuration configuration = new Configuration(new Environment(settings, path), settings).setUseSmart(false);
        IKSegmenter segmenter = new IKSegmenter(new StringReader(t), configuration);
        Lexeme next;
        while ((next = segmenter.next()) != null) {
            System.out.println(next.getLexemeText());
        }
    }
}

