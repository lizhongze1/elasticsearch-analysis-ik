/**
 *
 */
package org.wltea.analyzer.cfg;

import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.SpecialPermission;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.io.PathUtils;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.plugin.analysis.ik.AnalysisIkPlugin;
import org.wltea.analyzer.dic.Dictionary;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

import java.io.File;
import java.nio.file.Path;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class Configuration {
    private static final Logger logger = ESPluginLoggerFactory.getLogger(Configuration.class.getName());
    private Environment environment;
    private Settings settings;

    //是否启用智能分词
    private boolean useSmart;

    //是否启用远程词典加载
    private boolean enableRemoteDict = false;

    //是否启用小写处理
    private boolean enableLowercase = true;


    @Inject
    public Configuration(Environment env, Settings settings) {

        SpecialPermission.check();
        AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
            String jsonStr = JSONObject.toJSONString(env);
            logger.info("=====jsonStr:{}", jsonStr);
            return null;
        });
        this.environment = env;
        this.settings = settings;

        this.useSmart = settings.get("use_smart", "false").equals("true");
        this.enableLowercase = settings.get("enable_lowercase", "true").equals("true");
        this.enableRemoteDict = settings.get("enable_remote_dict", "true").equals("true");

        Dictionary.initial(this);

    }

    public Path getConfigInPluginDir() {
        return PathUtils
                .get(new File(AnalysisIkPlugin.class.getProtectionDomain().getCodeSource().getLocation().getPath())
                        .getParent(), "config")
                .toAbsolutePath();
    }

    public boolean isUseSmart() {
        return useSmart;
    }

    public Configuration setUseSmart(boolean useSmart) {
        this.useSmart = useSmart;
        return this;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public Settings getSettings() {
        return settings;
    }

    public boolean isEnableRemoteDict() {
        return enableRemoteDict;
    }

    public boolean isEnableLowercase() {
        return enableLowercase;
    }
}
