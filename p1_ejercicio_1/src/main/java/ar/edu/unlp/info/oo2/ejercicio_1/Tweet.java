package ar.edu.unlp.info.oo2.ejercicio_1;

public class Tweet {
	
	private String cuerpo;
	
	public Tweet(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public ReTweet reTweet () {
		ReTweet rt = new ReTweet(this.cuerpo, this);
		return rt;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
}
