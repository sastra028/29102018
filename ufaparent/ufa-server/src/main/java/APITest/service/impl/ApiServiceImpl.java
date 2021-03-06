package APITest.service.impl;


import APITest.dao.TableA1DAO;
import APITest.repository.ApiRepositoryImpl;
import APITest.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ApiRepositoryImpl apiRepository;

    @Override
    public String getDataFromTableA1All() {
        List<TableA1DAO> tableA1DAOList = apiRepository.findAll();
        StringBuilder response = new StringBuilder();
        for (TableA1DAO tableA1DAO : tableA1DAOList) {
            response.append(tableA1DAO.getId() +"," +tableA1DAO.getName()+"," +tableA1DAO.getLastName());
        }
        return response.toString();
    }

}
