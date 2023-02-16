package org.devops


def getcode(url,branchName) {

    checkout([$class: 'GitSCM', branches: [[name: "${branchName}"]], 
               doGenerateSubmoduleConfigurations: false, 
               extensions: [], 
               submoduleCfg: [], 
               userRemoteConfigs: [[credentialsId: '2c7be412-4d09-4476-bcda-ddb20d1f2142', url: "${url}"]]])

}
