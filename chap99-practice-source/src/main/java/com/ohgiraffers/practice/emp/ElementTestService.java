package com.ohgiraffers.practice.emp;

import com.ohgiraffers.common.DeptAndEmployeeDTO;
import com.ohgiraffers.common.EmployeeAndDeptDTO;
import com.ohgiraffers.common.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;


public class ElementTestService {

    private ElementTestMapper mapper;

    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployeeAndDeptDTO> empList = mapper.selectResultMapAssociationTest();

        for(EmployeeAndDeptDTO emp : empList) {
            System.out.println("사원이름 : " + emp.getEmpName() + " 부서명 : " + emp.getDept().getDeptTitle());
        }
        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<DeptAndEmployeeDTO> deptList = mapper.selectResultMapCollectionTest();

        for(int i = 0; i < deptList.size(); i++) {
            System.out.println("부서명 : " + deptList.get(i).getDeptTitle());
            List<EmployeeDTO> empList = deptList.get(i).getEmpList();
            for(EmployeeDTO emp : empList) {
                System.out.println("사원번호 : " + emp.getEmpId() + ", 사원명 : " + emp.getEmpName());
            }

        }


        sqlSession.close();

    }
}
