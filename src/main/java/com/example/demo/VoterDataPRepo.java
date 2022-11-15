package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface VoterDataPRepo extends JpaRepository<VoterDataPedakurapadu2, Integer>{

	
	@Query(value="SELECT id AS id , door_no as door_no,caste as caste,first_name as first_name,last_name as last_name,REPLACE(first_name_te, ' ', '') as first_name_te,last_name_te as last_name_te,gender as gender,relation_type as relation_type,age as age,relationship_name as relationship_name, relationlastnameen  as relationlastnameen, REPLACE(relationshipName, ' ', '') as relationshipName, relationshipSurname as relationshipSurname,village_or_ward_name as village_or_ward_name,SOUNDEX(relationship_name) AS relationship_namescore,SOUNDEX(first_name) AS first_namescore\r\n"
			+ "FROM voter_data_pedakurapadu\r\n"
			+ "WHERE village_or_ward_name = ?1\r\n"
			+ "AND door_no = ?2  AND caste = ?3 ORDER BY relationship_namescore ASC\r\n",nativeQuery = true)
	List<List<String>> getData(String villageName,String doorNo,String Caste);

	@Query(value="SELECT id AS id , door_no as door_no,caste as caste,first_name as first_name,last_name as last_name,REPLACE(first_name_te, ' ', '') as first_name_te,last_name_te as last_name_te,gender as gender,relation_type as relation_type,age as age,relationship_name as relationship_name, relationlastnameen  as relationlastnameen, REPLACE(relationshipName, ' ', '') as relationshipName, relationshipSurname as relationshipSurname,village_or_ward_name as village_or_ward_name,SOUNDEX(relationship_name) AS relationship_namescore,SOUNDEX(first_name) AS first_namescore\r\n"
			+ "FROM voter_data_pedakurapadu\r\n"
			+ "WHERE  door_no = ?1  AND caste = ?2 ORDER BY relationship_namescore ASC\r\n",nativeQuery = true)
	List<List<String>> getData1(String door_no, String caste);
	
	@Procedure("searchBySurnameTest")
	void searchBySurnameTest1(String model);
	
	@Query(value=
	"SELECT  col1 FROM namesList ORDER BY priority ASC", nativeQuery = true)
	String [] getNameList2();

	
	@Procedure("searchBySurname")
	void searchBySurname(String name, String houseName);


	@Query(value=
	"SELECT  * FROM voter_data_pedakurapadu WHERE village_or_ward_name = ?1 AND constituency_name= ?2", nativeQuery = true)
	List<VoterDataPedakurapadu2> findByVillageOrWardNameAndConstituencyName(String villageOrWardName,
			String constituencyName);

	@Query(value=
	"SELECT  id AS id , SOUNDEX(relationship_name) AS relationship_namescore,SOUNDEX(first_name) AS first_namescore,relation_type,updatedsurname  FROM voter_data_pedakurapadu WHERE familyId = ?1", nativeQuery = true)
	List<List<String>> getDataForVdpDataToGetData(String familyId);

	@Modifying
	@Query(value="UPDATE voter_data_pedakurapadu SET familysorting= ?2 WHERE id=?1")
	void updatevdp(long id, String familyId);
	
	
}
