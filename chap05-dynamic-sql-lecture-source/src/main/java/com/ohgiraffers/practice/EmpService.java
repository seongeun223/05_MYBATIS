package com.ohgiraffers.practice;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.Template;
import com.ohgiraffers.compractice.EmpDTO;
import com.ohgiraffers.compractice.SearchCriteria;

import org.apache.ibatis.session.SqlSession;


import java.util.List;

import static com.ohgiraffers.compractice.Template.getSqlSession;


public class EmpService {

    private EmpSqlMapper mapper;

    public void searchEmp(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmpSqlMapper.class);

        List<EmpDTO> empList = mapper.searchEmp(searchCriteria);

        if(empList != null && empList.size() > 0) {
            for(EmpDTO emp : empList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();
    }

    public void searchEmpByCodeOrSearchAll(SearchCriteria searchCriteria) {

        SqlSession sqlSession = Template.getSqlSession();

        mapper = sqlSession.getMapper(EmpSqlMapper.class);

//
////        List<MenuDTO> menuList = mapper.searchMenuByCodeOrSearchAll(searchCriteria);
//
//        if(menuList != null && menuList.size() > 0) {
//            for(MenuDTO menu : menuList) {
//                System.out.println(menu);
//            }
//        } else {
//            System.out.println("검색 결과가 존재하지 않습니다.");
//        }
//        sqlSession.close();
    }
}
