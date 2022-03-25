package com.example.portfolio.InfoPersonal;

import com.example.portfolio.InfoPersonal.infoPersonal;
import java.util.List;

public interface IPersonalService {

    public List<infoPersonal> getInfoPersonal();

    public void saveInfoPersonal(infoPersonal info);

    public void deleteInfoPersonal(Long id);

    public infoPersonal findInfoPersonal(Long id);
}
