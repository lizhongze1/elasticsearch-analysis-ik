package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

/**
 * 　  * @className: HotDictReloadThread
 * 　　* @description:热词更新
 * 　　* @param:
 * 　　* @return:
 * 　　* @throws:
 * 　　* @email lzz215855518@gmail.com
 * 　　* @author: lizz
 * 　　* @date: 2022/04/11 15:09
 */
public class HotDictReloadThread {
    private static final Logger log = ESPluginLoggerFactory.getLogger(HotDictReloadThread.class.getName());

    public void initial() {
        while (true) {
            log.info("正在调用HotDictReloadThread...");
            Dictionary.getSingleton().reLoadMainDict();
        }
    }
}
