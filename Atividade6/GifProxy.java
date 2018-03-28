import java.io.IOException;

class GifProxy implements Imagem {
	Cabecalho cabecalho;
	Path path;

	GifProxy(Path path, Cabecalho cabecalho) {
		this.path = path;
		this.cabecalho = cabecalho;
	}

	@Override
	public short altura() {
		return this.cabecalho.altura();
	}

	@Override
	public short largura() {
		return this.cabecalho.largura();
	}

	@Override
	public String getTipo() {
		return this.path.getTipo();
	}

	@Override
	public void draw() throws IOException {
		System.out.println("Desenha imagem " + largura() + " x " + altura());
	}

	@Override
	public byte[][] content() throws IOException {
		return new byte[][] { new byte[] { 0, 1 } };
	}
}