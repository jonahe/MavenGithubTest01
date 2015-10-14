package com.jonahe.mavenplusgithub;

/**
 * Use me from another project, using JitPack.io ?
 *
 */
public class HelloClass 
{
   public String getHelloMessage(String name){
	   return "Hello " + name + "!";
   }
   
   public String getMessageAddedFromGitHub(){
   	return "This message was added from github, to ensure that the import really was from here, and not some local variation";
   }
   
   public String getYetAnotherMessageNowUsingSNAPSHOTToAlwaysGetTheLatestCommit(){
   	return "Message from latest commit";
   }
}
