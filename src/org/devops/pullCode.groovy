package org.devops


def getcode(url,branchName) {

    checkout([$class: 'GitSCM', branches: [[name: "${branchName}"]], 
               doGenerateSubmoduleConfigurations: false, 
               extensions: [], 
               submoduleCfg: [], 
               userRemoteConfigs: [[credentialsId: 'gitlab-admin-user', url: "${url}"]]])

}
