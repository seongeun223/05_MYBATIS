package com.ohgiraffers.practice.service;

import com.ohgiraffers.practice.dao.EmpMapper;
import com.ohgiraffers.practice.dto.EmpDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.template.Template.getSqlSession;


public class EmpService {

    private EmpMapper empMapper;

    public List<EmpDTO> selectAllEmp() {
        SqlSession sqlSession = getSqlSession();

        empMapper = sqlSession.getMapper(EmpMapper.class);

        List<EmpDTO> empList = empMapper.selectAllEmp();

        sqlSession.close();

        return empList;
    }

    public EmpDTO selectEmpByCode(String empId) {

        SqlSession sqlSession = getSqlSession();

        empMapper = sqlSession.getMapper(EmpMapper.class);

        EmpDTO emp = empMapper.selectEmpByCode(empId);

        sqlSession.close();

        return emp;
    }

    public EmpDTO selectEmpByName(String empName) {

        SqlSession sqlSession = getSqlSession();

        empMapper = sqlSession.getMapper(EmpMapper.class);

        EmpDTO emp = empMapper.selectEmpByName(empName);

        sqlSession.close();

        return emp;
    }

    public boolean registEmp(EmpDTO emp) {

        SqlSession sqlSession = getSqlSession();

        empMapper = sqlSession.getMapper(EmpMapper.class);

        int result = empMapper.registEmp(emp);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyEmp(EmpDTO emp) {

        SqlSession sqlSession = getSqlSession();

        empMapper = sqlSession.getMapper(EmpMapper.class);

        int result = empMapper.modifyEmp(emp);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }

    public boolean deleteEmp(String empId) {

        SqlSession sqlSession = getSqlSession();

        empMapper = sqlSession.getMapper(EmpMapper.class);

        int result = empMapper.deleteEmp(empId);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }
}
