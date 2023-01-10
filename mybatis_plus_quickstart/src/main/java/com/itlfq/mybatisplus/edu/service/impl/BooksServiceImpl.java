package com.itlfq.mybatisplus.edu.service.impl;

import com.itlfq.mybatisplus.edu.domain.Books;
import com.itlfq.mybatisplus.edu.dao.BooksMapper;
import com.itlfq.mybatisplus.edu.service.BooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表信息 服务实现类
 * </p>
 *
 * @author itlfq
 * @since 2023-01-08
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {

}
