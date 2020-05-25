package java.test.tool.collections;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.client.JenkinsHttpClient;
import com.offbytwo.jenkins.model.Job;
import java.io.IOException;
//import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class JenkinsClientApi {

    public static void main(String[] args){
        try{
            URI uri = new URI("http://47.106.229.187:8080/jenkins/");
            JenkinsHttpClient jclient = new JenkinsHttpClient(uri, "admin", "8a9377aef2a64e169527367762338200");
            JenkinsServer jenkinsServer = new JenkinsServer(jclient);
            try
            {
                Map<String, Job> Jobs = jenkinsServer.getJobs();
                // 指定项目
                jenkinsServer.getJob("hml_jenkins_test").build();
                System.out.println(Jobs);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return;
        }
        catch (URISyntaxException urie)
        {
            urie.printStackTrace();
        }
    }
}
