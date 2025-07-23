package modules.workflowTestbed.DocumentTwo;

import org.apache.commons.lang3.RandomStringUtils;

import modules.workflowTestbed.domain.DocumentTwo;

public class DocumentTwoExtension extends DocumentTwo {

    public String doNothing() {
        
        return RandomStringUtils.random(50);
    }
}
