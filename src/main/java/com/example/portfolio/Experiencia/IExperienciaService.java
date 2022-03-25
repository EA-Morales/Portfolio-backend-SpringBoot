package com.example.portfolio.Experiencia;

import java.util.List;

public interface IExperienciaService {

    public List<experiencia> getExperiencia();

    public void saveExperiencia(experiencia exp);

    public void deleteExperiencia(Long id);

    public experiencia findExperiencia(Long id);
}
