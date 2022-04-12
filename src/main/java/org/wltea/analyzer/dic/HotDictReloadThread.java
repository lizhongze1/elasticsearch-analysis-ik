package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

/**
 * 　  * @className: HotDictReloadThread
 * 　　* @description:TODO
 * 　　* @param:
 * 　　* @return:
 * 　　* @throws:
 * 　　* @email lzz215855518@gmail.com
 * 　　* @author: lizz
 * 　　* @date: 2022/04/12 9:51
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
