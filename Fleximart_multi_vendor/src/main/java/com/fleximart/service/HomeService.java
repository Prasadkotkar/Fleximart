package com.fleximart.service;

import com.fleximart.model.Home;
import com.fleximart.model.HomeCategory;
import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
