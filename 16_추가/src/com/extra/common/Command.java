package com.extra.common;

public enum Command {
	SEARCH_DIR("ls $path"), CREATE_DIR("mkdir $path"), 
	DOCKER_START("docker run $image");
	
	private String commnad;
	private Command(String commend) {
		this.commnad=commend;
	}
	
	public String getCommend() {
		return this.commnad;
	}
}
