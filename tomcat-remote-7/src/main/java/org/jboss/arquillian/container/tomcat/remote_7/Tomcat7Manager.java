package org.jboss.arquillian.container.tomcat.remote_7;

import java.util.logging.Logger;

import org.jboss.arquillian.container.tomcat.CommonTomcatConfiguration;
import org.jboss.arquillian.container.tomcat.CommonTomcatManager;

public class Tomcat7Manager<C extends CommonTomcatConfiguration> extends CommonTomcatManager {
    private static Logger log = Logger.getLogger(Tomcat7Manager.class.getName());

    public Tomcat7Manager(CommonTomcatConfiguration configuration) {
        super(configuration);
    }

    protected String getDeployCommand()
    {
       return "/text/deploy?path=";
    }

    protected String getUndeployCommand()
    {
       return "/text/undeploy?path=";
    }

    protected String getListCommand()
    {
       return "/text/list";
    }
}
