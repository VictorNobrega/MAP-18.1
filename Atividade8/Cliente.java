import domain.ImagemAdapter;
import domain.ImagemBMP;
import domain.ImagemJpeg;
import domain.ImagemPNG;
import interfaces.Imagem;

public class Cliente {

	public static void main(String[] args) {
		
		Imagem imagemBMP = new ImagemBMP();
		Imagem imagemJpeg = new ImagemJpeg();
		Imagem imagemPng = new ImagemPNG();
		ImagemAdapter adapter = new ImagemAdapter();
		
		adapter.carregarImagem(imagemBMP);
		adapter.desenharImagem(imagemBMP);
		
		adapter.carregarImagem(imagemJpeg);
		adapter.desenharImagem(imagemJpeg);
		
		adapter.carregarImagem(imagemPng);
		adapter.desenharImagem(imagemPng);
		
	}
}
