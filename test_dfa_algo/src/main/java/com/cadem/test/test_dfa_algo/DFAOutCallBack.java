package com.cadem.test.test_dfa_algo;

/**
 * 这是个简单的接口，表示发现匹配关键词后应做的操作
 * keyword:匹配的关键词
 */
interface DFAOutCallBack {
 public void CallBack(String keyword);
};

