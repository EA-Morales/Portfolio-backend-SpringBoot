package com.example.portfolio.service;

import com.example.portfolio.model.infoPersonal;

import java.util.List;

public interface IPersonalService {

    public List<infoPersonal> getInfoPersonal();

    public void saveInfoPersonal (infoPersonal infoPerso);

    public void deleteInfoPersonal (Long id);

    public infoPersonal findInfoPersonal(Long id);
}
