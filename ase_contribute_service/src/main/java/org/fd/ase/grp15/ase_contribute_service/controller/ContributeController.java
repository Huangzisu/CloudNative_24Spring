package org.fd.ase.grp15.ase_contribute_service.controller;

import org.fd.ase.grp15.ase_contribute_service.entity.Contribution;
import org.fd.ase.grp15.ase_contribute_service.entity.vo.ListContribution;
import org.fd.ase.grp15.ase_contribute_service.request.ContributeRequest;
import org.fd.ase.grp15.ase_contribute_service.response.ResponseWithData;
import org.fd.ase.grp15.ase_contribute_service.service.ContributeServiceImpl;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ContributeController {
    @Resource
    private ContributeServiceImpl service;

    @PostMapping("/contribute")
    public ResponseWithData<String> contribute(@RequestBody @Validated ContributeRequest.In in){
        return new ResponseWithData(service.contribute(in));
    }

    @GetMapping("/contribute/listByName/{username}")
    public ResponseWithData<List<ListContribution>> listContribute(@PathVariable("username") String username){
        return new ResponseWithData(service.listContributionsByUsername(username), "");
    }

    @GetMapping("/contribute/listByConference/{conferenceName}")
    public ResponseWithData<List<ListContribution>> conferenceContribute(@PathVariable("conferenceName") String name){
        return new ResponseWithData(service.listContributionsByConferenceName(name), "");
    }

    @GetMapping("/contribute/detail/{contributeId}")
    public ResponseWithData<Contribution> contributeDetail(@PathVariable("contributeId") String contributeId){
        return new ResponseWithData(service.detailById(contributeId), "");
    }

}
