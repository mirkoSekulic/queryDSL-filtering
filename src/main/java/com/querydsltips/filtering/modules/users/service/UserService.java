package com.querydsltips.filtering.modules.users.service;

import com.querydsltips.filtering.modules.users.domain.User;
import com.querydsltips.filtering.modules.users.filter.UserFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> findAll(UserFilter userFilter, Pageable pageable);

    Page<User> findAllWithQueryDSLFiltering(UserFilter userFilter, Pageable pageable);
}
