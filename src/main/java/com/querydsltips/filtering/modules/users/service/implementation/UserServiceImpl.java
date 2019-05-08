package com.querydsltips.filtering.modules.users.service.implementation;

import com.querydsltips.filtering.modules.users.domain.User;
import com.querydsltips.filtering.modules.users.filter.UserFilter;
import com.querydsltips.filtering.modules.users.predicate.UserPredicateFactory;
import com.querydsltips.filtering.modules.users.repository.UserRepository;
import com.querydsltips.filtering.modules.users.service.UserService;
import com.querydsltips.filtering.modules.users.specification.UserSpecification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Page<User> findAll(@NotNull UserFilter userFilter, Pageable pageable) {
        return userRepository.findAll(UserSpecification.of(userFilter), pageable);
    }

    @Override
    public Page<User> findAllWithQueryDSLFiltering(UserFilter userFilter, Pageable pageable) {
        return userRepository.findAll(UserPredicateFactory.createUserFilterPredicate(userFilter), pageable);
    }
}
