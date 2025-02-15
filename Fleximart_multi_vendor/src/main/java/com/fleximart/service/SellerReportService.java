package com.fleximart.service;

import com.fleximart.model.Seller;
import com.fleximart.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
