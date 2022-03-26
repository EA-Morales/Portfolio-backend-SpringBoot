package com.example.portfolio.Proyecto;

import java.util.List;

public interface IProyectoService {

    public List<proyecto> getProyecto();

    public void saveProyecto(proyecto proye);

    public void deleteProyecto(Long id);

    public proyecto findProyecto(Long id);


}
