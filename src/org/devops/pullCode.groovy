package org.devops


def getcode(url,branchName) {

    checkout([$class: 'GitSCM', branches: [[name: "${branchName}"]], 
               doGenerateSubmoduleConfigurations: false, 
               extensions: [], 
               submoduleCfg: [], 
               userRemoteConfigs: [[credentialsId: '48547a85-e4d1-46b2-ade5-6cdbacf8e8f2', url: "${url}"]]])

}
