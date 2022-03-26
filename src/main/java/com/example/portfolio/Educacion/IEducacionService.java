package com.example.portfolio.Educacion;

import java.util.List;

public interface IEducacionService {

    public List<educacion> getEducacion();

    public void saveEducacion(educacion educ);

    public void deleteEducacion(Long id);

    public educacion findEducacion(Long id);
}
