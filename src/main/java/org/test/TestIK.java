/*
package org.test;

import org.elasticsearch.common.settings.Settings;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

import java.io.IOException;
import java.io.StringReader;

*/
/**
 * 　  * @className: TestIK
 * 　　* @description:TODO
 * 　　* @param:
 * 　　* @return:
 * 　　* @throws:
 * 　　* @email lzz215855518@gmail.com
 * 　　* @author: lizz
 * 　　* @date: 2022/04/12 11:41
 *//*

public class TestIK {
    public static void main(String[] args) throws IOException {
        testIkSegment();
    }

    public static void testIkSegment() throws IOException {
        String t = "得饶人处且饶人";
        Settings settings = Settings.builder()
                .put("use_smart", false)
                .put("enable_lowercase", false)
                .put("enable_remote_dict", false)
                .build();
        Configuration configuration = new Configuration(null, settings).setUseSmart(false);
        IKSegmenter segmenter = new IKSegmenter(new StringReader(t), configuration);
        Lexeme next;
        while ((next = segmenter.next()) != null) {
            System.out.println(next.getLexemeText());
        }
    }
}
*/
