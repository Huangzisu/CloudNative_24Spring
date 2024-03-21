package org.fd.ase.grp15.ase_contribute_service.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.fd.ase.grp15.ase_contribute_service.entity.Contribution;
import org.fd.ase.grp15.ase_contribute_service.entity.vo.ListContribution;
import org.fd.ase.grp15.ase_contribute_service.repository.ContributeRepository;
import org.fd.ase.grp15.ase_contribute_service.request.ContributeRequest;
import org.fd.ase.grp15.common.iservice.IConferenceService;
import org.fd.ase.grp15.common.iservice.IUserConferenceRoleService;
import org.fd.ase.grp15.common.iservice.conference.dto.ConferenceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;

@Service
public class ContributeServiceImpl {

    @Autowired
    private ContributeRepository contributeRepository;
    @DubboReference(check = false)
    private IUserConferenceRoleService iUserConferenceRoleService;

    @DubboReference(check = false)
    private IConferenceService conferenceService;

    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String contribute(ContributeRequest.In in) {
        // TODO
        // 步骤如下：
        // 1. 调用conferenceService.getConferenceInfoByName获取会议信息(基于dubbo的rpc调用)
        // 2. 检查会议状态是否为“投稿中”，以及投稿截止时间是否已过
        // 3. 调用iUserConferenceRoleService.addRoleToUserInConference给用户添加author身份(基于dubbo的rpc调用)
        // 4. 创建Contribution对象并保存到数据库
        // 如果在过程中出现异常，可以抛出RuntimeException

        return null;
    }

    public List<ListContribution> listContributionsByUsername(String author) {
        // TODO
        return null;
    }
  
    public List<ListContribution> listContributionsByConferenceName(String name) {
        // TODO
        List<Contribution> contributionList = contributeRepository.findAllByConferenceName(name);
        List<ListContribution> resultList = new ArrayList<>();
        for(Contribution contribution: contributionList){
            resultList.add(new ListContribution(contribution));
        }
        return resultList;
    }

    public Contribution detailById(String idStr) {
        // TODO
        return contributeRepository.findContributionById(Long.parseLong(idStr));
    }
}
