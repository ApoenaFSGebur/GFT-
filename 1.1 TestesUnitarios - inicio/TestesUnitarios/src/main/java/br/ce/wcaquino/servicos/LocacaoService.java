package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

import java.util.Date;
import java.util.List;

import br.ce.wcaqquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaqquino.exceptions.LocadoraException;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;

public class LocacaoService {

	@SuppressWarnings("unused")
	public Locacao alugarFilme(Usuario usuario, List<Filme> filme) throws FilmeSemEstoqueException, LocadoraException {

		if (usuario == null) {
			throw new LocadoraException("Usuário vazio!");
		}

		if (filmes == null || filmes.isEmpty()) {
			throw new LocadoraException("Filme vazio!");
		}

		for (Filme filme : filmes) {
			if (filme.getEstoque() == 0) {
				throw new FilmeSemEstoqueException();

				Locacao locacao = new Locacao();
				locacao.setFilme(filmes);
				locacao.setUsuario(usuario);
				locacao.setDataLocacao(new Date());
				Double valorTotal = 0d;
				for(Filme filme: filmes) {
					valorTotal += filme.getPrecoLocacao();
				}
				locacao.setValor(filme.getPrecoLocacao());

				// Entrega no dia seguinte
				Date dataEntrega = new Date();
				dataEntrega = adicionarDias(dataEntrega, 1);
				locacao.setDataRetorno(dataEntrega);

				return locacao;
			}
		}
	}
}
