package com.example.portfolio.Habilidad;

import java.util.List;

public interface IHabilidadService {

    public List<habilidad> getHabilidad();

    public void saveHabilidad(habilidad habi);

    public void deleteHabilidad(Long id);

    public habilidad findHabilidad(Long id);
}
