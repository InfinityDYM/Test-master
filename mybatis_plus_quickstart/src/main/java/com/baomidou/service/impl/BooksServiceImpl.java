package com.baomidou.service.impl;

import com.baomidou.entity.Books;
import com.baomidou.mapper.BooksMapper;
import com.baomidou.service.BooksService;
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
