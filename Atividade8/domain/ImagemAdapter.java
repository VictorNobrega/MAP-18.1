package domain;
import interfaces.Imagem;
import interfaces.ImagemTarget;

public class ImagemAdapter implements ImagemTarget{

	
	public void carregarImagem(Imagem imagem) {
		imagem.cImagem();
	}

	public void desenharImagem(Imagem imagem) {
		imagem.dImagem();
	}
}
