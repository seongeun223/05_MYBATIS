package com.ohgiraffers.practice;
import com.ohgiraffers.compractice.EmpDTO;
import com.ohgiraffers.compractice.SearchCriteria;
import org.apache.ibatis.session.SqlSession;
import java.util.List;
import java.util.Map;
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

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmpSqlMapper.class);


        List<EmpDTO> empList = mapper.searchEmpByCodeOrSearchAll(searchCriteria);

        if(empList != null && empList.size() > 0) {
            for(EmpDTO emp : empList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();
    }

    public void searchEmpByNameORDept(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(EmpSqlMapper.class);


        List<EmpDTO> empList = mapper.searchMenuByNameORDept(criteria);

        if(empList != null && empList.size() > 0) {
            for(EmpDTO emp : empList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }
        sqlSession.close();
    }
}
