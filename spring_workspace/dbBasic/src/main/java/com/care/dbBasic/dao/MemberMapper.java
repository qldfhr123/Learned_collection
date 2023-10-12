package com.care.dbBasic.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.care.dbBasic.MemberDTO;

@Repository
public interface MemberMapper {
	MemberDTO selectId(String id);
	void register(MemberDTO member);
	void update(MemberDTO member) ;
	void delete(String id);
	/** 2개이상일때는 @param 사용해야한다.....*/
	int count(@Param("select")String select, @Param("search")String search); 
	ArrayList<MemberDTO> selectAll(@Param("begin")int begin,@Param("end") int end, @Param("select")String select, @Param("search")String search);
}

