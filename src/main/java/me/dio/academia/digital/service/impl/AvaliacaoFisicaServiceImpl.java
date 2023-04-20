package me.dio.academia.digital.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

  private final AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  private final AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(form.getPeso());
    avaliacaoFisica.setAltura(form.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return avaliacaoFisicaRepository.findById(id).orElseThrow(() -> new RuntimeException("Avaliação Física não encontrada"));
  }

  @Override
  public List<AvaliacaoFisica> getAll() {
    return avaliacaoFisicaRepository.findAll();
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
    return avaliacaoFisicaRepository.findById(id).map(avaliacaoFisica -> {
      avaliacaoFisica.setPeso(formUpdate.getPeso());
      avaliacaoFisica.setAltura(formUpdate.getAltura());

      return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }).orElseThrow(() -> new RuntimeException("Avaliação Física não encontrada"));
  }

  @Override
  public void delete(Long id) {
    avaliacaoFisicaRepository.deleteById(id);
  }
}
