package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {

	@PostMapping("/test1")
	public Object get(@RequestBody List<Vdp> vdps) {
		List<Vdp> list = vdps;

		Map<String, VdpRelationsModel> vdpRelationsModels = new HashMap<String, VdpRelationsModel>();
		for (Vdp i : list) {
			vdpRelationsModels.put(i.getFirst_name(), new VdpRelationsModel(i));

		}
		for (Vdp i : list) {
			String firstName = i.getFirst_name();

			if (vdpRelationsModels.containsKey(i.getRelationship_name())) {
				switch (i.getRelation_type()) {
				case "S/o":
					vdpRelationsModels.get(i.getRelationship_name()).getSonsList()
							.add(vdpRelationsModels.get(firstName));
					break;
				case "D/o":
					vdpRelationsModels.get(i.getRelationship_name()).getDaughterList()
							.add(vdpRelationsModels.get(firstName));
					break;
				case "W/o":
					vdpRelationsModels.get(i.getRelationship_name()).getWifeList()
							.add(vdpRelationsModels.get(firstName));
					break;
				}

			}

		}
		List<VdpRelationsModel> vdpRelationsModels2 = new ArrayList<VdpRelationsModel>();
		for (Vdp i : list) {
			if (!vdpRelationsModels.containsKey(i.getRelationship_name()))
				vdpRelationsModels2.add(vdpRelationsModels.get(i.getFirst_name()));
		}
		return vdpRelationsModels2;
	}

	@PostMapping("/test")
	public Object get1(@RequestBody List<Vdp> vdps) {
		List<Vdp> list = vdps;

		Map<String, VdpRelationsModel> vdpRelationsModels = new HashMap<String, VdpRelationsModel>();
		for (Vdp i : list) {
			vdpRelationsModels.put(i.getFirst_name_te(), new VdpRelationsModel(i));

		}
		for (Vdp i : list) {
			String firstName = i.getFirst_name_te();

			if (vdpRelationsModels.containsKey(i.getRelationshipName())) {
				switch (i.getRelation_type()) {
				case "S/o":
					vdpRelationsModels.get(i.getRelationshipName()).getSonsList()
							.add(vdpRelationsModels.get(firstName));
					break;
				case "D/o":
					vdpRelationsModels.get(i.getRelationshipName()).getDaughterList()
							.add(vdpRelationsModels.get(firstName));
					break;
				case "W/o":
					vdpRelationsModels.get(i.getRelationshipName()).getWifeList()
							.add(vdpRelationsModels.get(firstName));
					break;
				}

			}

		}
		List<VdpRelationsModel> vdpRelationsModels2 = new ArrayList<VdpRelationsModel>();
		for (Vdp i : list) {
			if (!vdpRelationsModels.containsKey(i.getRelationshipName()))
				vdpRelationsModels2.add(vdpRelationsModels.get(i.getFirst_name_te()));
		}

		List<Vdp> vdps2 = new LinkedList<Vdp>();
		for (VdpRelationsModel i : vdpRelationsModels2) {
			vdps2.add(new Vdp(i));
			for (VdpRelationsModel j : i.getWifeList()) {
				vdps2.add(new Vdp(j));
			}
			for (VdpRelationsModel j : i.getSonsList()) {
				vdps2.add(new Vdp(j));
			}
			for (VdpRelationsModel j : i.getDaughterList()) {
				vdps2.add(new Vdp(j));
			}

		}

		return vdps2;
	}

	@Autowired
	VoterDataPRepo dataPRepo;

	@GetMapping("/test3")
	public Object getDataFromDb(@RequestParam String door_no, @RequestParam String caste,
			@RequestParam(required = false) String village_or_ward_name) {

		if (village_or_ward_name == null) {
			List<Vdp> list = stringListToVdp(dataPRepo.getData1(door_no, caste));

			return get1(list);
		} else {
			List<Vdp> list = stringListToVdp(dataPRepo.getData(village_or_ward_name, door_no, caste));

			return get1(list);
		}
	}

	public List<Vdp> stringListToVdp(List<List<String>> data) {
		List<Vdp> list = new ArrayList<Vdp>();

		for (List<String> i : data) {
			System.out.println(i.size());
			Vdp vdp = new Vdp(i.get(0), i.get(1), i.get(2), i.get(3), i.get(4), i.get(5), i.get(6), i.get(7), i.get(8),
					i.get(9), i.get(10), i.get(11), i.get(12), i.get(13), i.get(14), i.get(15), i.get(16));
			list.add(vdp);
		}
		return list;

	}

	@GetMapping("/test4")
	public Object getFamilyTree(@RequestParam String door_no, @RequestParam String caste,
			@RequestParam(required = false) String village_or_ward_name) {
		List<Vdp> list = null;
		if (village_or_ward_name == null) {
			list = stringListToVdp(dataPRepo.getData1(door_no, caste));

		} else {
			list = stringListToVdp(dataPRepo.getData(village_or_ward_name, door_no, caste));

		}

		Map<String, VdpRelationsModel> vdpRelationsModels = new HashMap<String, VdpRelationsModel>();
		for (Vdp i : list) {
			vdpRelationsModels.put(i.getFirst_namescore(), new VdpRelationsModel(i));

		}
		for (Vdp i : list) {
			String firstNamescore = i.getFirst_namescore();

			if (vdpRelationsModels.containsKey(i.getRelationship_namescore())) {
				switch (i.getRelation_type()) {
				case "S/o":
					vdpRelationsModels.get(i.getRelationship_namescore()).getSonsList()
							.add(vdpRelationsModels.get(firstNamescore));
					break;
				case "D/o":
					vdpRelationsModels.get(i.getRelationship_namescore()).getDaughterList()
							.add(vdpRelationsModels.get(firstNamescore));
					break;
				case "W/o":
					vdpRelationsModels.get(i.getRelationship_namescore()).getWifeList()
							.add(vdpRelationsModels.get(firstNamescore));
					break;
				}

			}

		}
		List<VdpRelationsModel> vdpRelationsModels2 = new ArrayList<VdpRelationsModel>();
		for (Vdp i : list) {
			if (!vdpRelationsModels.containsKey(i.getRelationship_namescore()))
				vdpRelationsModels2.add(vdpRelationsModels.get(i.getFirst_namescore()));
		}

		List<Vdp> vdps2 = new LinkedList<Vdp>();
		List<Vdp> vdps3 = new LinkedList<Vdp>();
		for (VdpRelationsModel i : vdpRelationsModels2) {

			if (i.daughterList.size() > 0 || i.sonsList.size() > 0 || i.wifeList.size() > 0) {
				vdps2.add(new Vdp(i));

				addFamilyToList(i, vdps2);

			} else
				vdps3.add(new Vdp(i));

		}
		vdps2.addAll(vdps3);
		return vdps2;
	}

	public void addFamilyToList(VdpRelationsModel model, List<Vdp> vdps2) {
		for (VdpRelationsModel j : model.getWifeList()) {
			vdps2.add(new Vdp(j));
			if (j.daughterList.size() > 0 || j.sonsList.size() > 0 || j.wifeList.size() > 0) {
				addFamilyToList(j, vdps2);
			}
		}

		for (VdpRelationsModel j : model.getDaughterList()) {
			vdps2.add(new Vdp(j));
			if (j.daughterList.size() > 0 || j.sonsList.size() > 0 || j.wifeList.size() > 0) {
				addFamilyToList(j, vdps2);
			}
		}
		for (VdpRelationsModel j : model.getSonsList()) {
			vdps2.add(new Vdp(j));
			if (j.daughterList.size() > 0 || j.sonsList.size() > 0 || j.wifeList.size() > 0) {
				addFamilyToList(j, vdps2);
			}
		}

	}

	@GetMapping("/sort")
	public Object getSortedData(@RequestParam String name) {
		dataPRepo.searchBySurnameTest1(name);
		return dataPRepo.getNameList2();
	}

	@GetMapping("/sort2")
	public Object getSortedData2(@RequestParam String name, @RequestParam String houseName) {
		dataPRepo.searchBySurname(name, houseName);
		return dataPRepo.getNameList2();
	}

	@GetMapping("/updateTableWithFamilyId")
	public Object updateTableWithFamilyId(@RequestParam String familyId) {
		// Get data in a list using villageOrWardName, constituencyName
		// Categorise into different surnames
		// sort different list of family members to data and give family id
		// update the table with the data

		List<List<String>> data = dataPRepo.getDataForVdpDataToGetData(familyId);

		List<VdpDataToGetData> vdpDataToGetDataList = new LinkedList<VdpDataToGetData>();
		for (List<String> i : data) {
//			System.out.println(i.size());
			VdpDataToGetData vdp = new VdpDataToGetData();
			vdp.id = Integer.parseInt(i.get(0));
			vdp.relationship_namescore = i.get(1);
			vdp.first_namescore = i.get(2);
			vdp.relation_type = i.get(3);
			vdp.surname = i.get(4);
			vdp.sonsList = new LinkedList<VdpDataToGetData>();
			vdp.daughterList = new LinkedList<VdpDataToGetData>();
			vdp.wifeList = new LinkedList<VdpDataToGetData>();
			vdpDataToGetDataList.add(vdp);
		}

		Map<String, LinkedList<VdpDataToGetData>> map = new HashMap<String, LinkedList<VdpDataToGetData>>();

		for (VdpDataToGetData i : vdpDataToGetDataList) {
			if (map.get(i.surname) == null)
				map.put(i.surname, new LinkedList<VdpDataToGetData>());

			map.get(i.surname).add(i);
		}
		List<VdpDataToGetData> finalListData = new LinkedList<VdpDataToGetData>();
		int familyOrder = 1;
		int memberOrder = 1;
		for (String surname : map.keySet()) {
//			System.out.println(surname);

			List<VdpDataToGetData> list = map.get(surname);

			Map<String, VdpDataToGetData> vdpRelationsModels = new HashMap<String, VdpDataToGetData>();
			for (VdpDataToGetData i : list) {
				vdpRelationsModels.put(i.first_namescore, i);

			}
			for (VdpDataToGetData i : list) {
				String firstNamescore = i.first_namescore;

				if (vdpRelationsModels.containsKey(i.relationship_namescore)) {
					switch (i.relation_type) {
					case "S/o":

					{
							vdpRelationsModels.get(i.relationship_namescore).sonsList
									.add(vdpRelationsModels.get(firstNamescore));
					}
						break;
					case "D/o": {
							vdpRelationsModels.get(i.relationship_namescore).daughterList
									.add(vdpRelationsModels.get(firstNamescore));
					}
						break;
					case "W/o": {
							vdpRelationsModels.get(i.relationship_namescore).wifeList
									.add(vdpRelationsModels.get(firstNamescore));
					}
						break;
					}

				}

			}
			List<VdpDataToGetData> vdpRelationsModels2 = new ArrayList<VdpDataToGetData>();
			for (VdpDataToGetData i : list) {
				if (!vdpRelationsModels.containsKey(i.relationship_namescore))
					vdpRelationsModels2.add(vdpRelationsModels.get(i.first_namescore));
			}

			List<VdpDataToGetData> vdps2 = new LinkedList<VdpDataToGetData>();
			List<VdpDataToGetData> vdps3 = new LinkedList<VdpDataToGetData>();
			for (VdpDataToGetData i : vdpRelationsModels2) {

				if (i.daughterList.size() > 0 || i.sonsList.size() > 0 || i.wifeList.size() > 0) {
					vdps2.add(i);

					addFamilyToList(i, vdps2);

				} else
					vdps3.add(i);

			}
			vdps2.addAll(vdps3);
			finalListData.addAll(vdps2);

		}
		String s = finalListData.get(0).surname;
		for(VdpDataToGetData i:finalListData)
		{
			if(!s.equalsIgnoreCase(i.surname))
			{
				familyOrder++;
				memberOrder=1;
				
			}
			i.familyId = String.format("%04d", familyOrder)+String.format("%02d", memberOrder);
			memberOrder++;
		}
		
		for(VdpDataToGetData i:finalListData)
		{try {
			dataPRepo.updatevdp(i.id,i.familyId);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		return finalListData;

	}

	public void addFamilyToList(VdpDataToGetData model, List<VdpDataToGetData> vdps2) {

		for (VdpDataToGetData j : model.wifeList) {
			vdps2.add(j);
			if (j.daughterList.size() > 0 || j.sonsList.size() > 0 || j.wifeList.size() > 0) {
				addFamilyToList(j, vdps2);
			}
		}

		for (VdpDataToGetData j : model.daughterList) {
			vdps2.add(j);
			if (j.daughterList.size() > 0 || j.sonsList.size() > 0 || j.wifeList.size() > 0) {
				addFamilyToList(j, vdps2);
			}
		}
		for (VdpDataToGetData j : model.sonsList) {
			vdps2.add(j);
			if (j.daughterList.size() > 0 || j.sonsList.size() > 0 || j.wifeList.size() > 0) {
				{

					addFamilyToList(j, vdps2);
				}

			}
		}

	}
}
