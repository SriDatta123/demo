package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
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
			VdpRelationsModel model = new VdpRelationsModel();

			
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
		return vdpRelationsModels2;
	}
	@Autowired
	VoterDataPRepo dataPRepo;
	
	@GetMapping("/test3")
	public Object getDataFromDb(@RequestParam String door_no ,@RequestParam String caste  ,@RequestParam(required = false) String village_or_ward_name   ) {
		
		if(village_or_ward_name==null)
		{
			List<Vdp> list = stringListToVdp(dataPRepo.getData1( door_no, caste));
			
			return get1(list);
		}
		else
		{
		List<Vdp> list = stringListToVdp(dataPRepo.getData(village_or_ward_name, door_no, caste));
		
		return get1(list);
		}
	}
	
	public List<Vdp> stringListToVdp(List<List<String>> data)
	{
		List<Vdp> list = new ArrayList<Vdp>();
		
		for(List<String> i:data)
		{
			System.out.println(i.size());
			Vdp vdp = new Vdp(i.get(0),i.get(1),i.get(2),i.get(3),i.get(4),i.get(5),i.get(6),i.get(7),i.get(8),i.get(9),i.get(10),i.get(11),i.get(12),i.get(13),i.get(14),i.get(15));
		list.add(vdp);
		}
		return list;
		
	}
}
