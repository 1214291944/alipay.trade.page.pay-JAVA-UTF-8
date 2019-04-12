package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092600603173";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCCV2lqyDNoeTgS/+C8+Oce0lV9iO3N2OVeu1SbTqYCo8fhumTXdoLkj1BjK2UmmrQrA/FlfqDmw1y2HX0pc7TXMlroJ5tvcRewCL9laeUxZh/x+izloKRVfO635u0EsBc+RIWAJqmg06QjEuUY9fIvWkxVoJHRrH++F67z0r4Xe63mRwjS4g0yLR6uEoEbs5t4oER9SGoTAai4JANE4Yhtzl8+OZr4t4I9+t9E1LwntFeecR6aDGn5Wq4yOgrldWnah4qeyofR3ICFgonEHAHTCWYsgNAczptdnD7/JB6rdRXBHdYeUpx93ZUR9l8GvG5WZKZwkWnhxixaNT8uV9dvAgMBAAECggEAfbMVHAD06wU0WcZhE32rTuMjxUwfooxRMBnTT2/608LlikC67bwCIbBAo1L/WsqJhI5p6CrFu6aeq5cm1Koctgh++TLxSPk1EfRtuLz2ZryJhFBzqgRRV4yDn+FZpVK5J7jnUp52qn5Q5e5b+MWACcC4qz+OQTpte4LVm5ka8ANQyF0LGYGFLpcgtOc5tQo2MUDMG8J7fGLvuge44G9bcfnEJfn+1OOp0wq9RWGl6RAGCWvfSqKH4L8T71bF27nNSDyI87m102OG5Gog6Rm1sk70Uzzq4zFEjqOWspvp3onS+SLeO+hlyeClKXiOOCFaO86Bj5xISgpLiG1Izfg8SQKBgQDpcO+pny1acFIA23/TnagTDy+xvslm/VXxKTN8bNDujE3LL6VePw2yT2+2vz8Cf1vvdBMUn1CPxQfcoeTA5D4QMKrJxgLy3RsA+U4MDyk5peJCTstTWEYCJIKYdUfI4u3jysikHeIIvlZLTkPS+H8OfzgFpPlxFNvMW6xebRjRmwKBgQCO7+iIo8qLJs7PX50WwyI9GqzHColmgufH0i3ZzOm806QLIwubyA1zPyxln0oOyXEXAlItKNUkJ/13B9zjkSye34043k9RaA7t6xpMsQdxrdxxgARn2MPRJdoW9CI4Lkz79TcsBSbjgiFQaB00XWc+B+XsEGxkwnR11NHnBAzIvQKBgCgfQRHmSeVBaNa84zt73WdpNMlYAUWyRRMuAathCIf3lWdWyRVpwPDktk6ykCHdwe9mA+GHgFE1jCRfrvF4STJ/KtuDLP6RAhMoxkFMWcmOuVSsNkYc5et4WvnZLn1Yg4qjT9jlSfQ2wp4u1XltPGlBdF+D+1t0OlLlbrrMBXgBAoGAFlwZOCbHLHVprK78V+82j/B4TrqrO8oGkA+k9IlFlzBUXRmiW0A0Om8LduowH5gLhNnsGPxmOz22PMSSHVc8b63w3ZCJP+bTTwyUFKMs0u+rqGWqSsRx/Wm6cBTItZkomdGGS/CSYMyegYGH8AUcfWum4ALBshFpPnWIUGclyNECgYEAjhsned4JarX7oYvonDIyMw8PgDP9uOzIHsi0DtHzBPfYbBJNx696+91aI7wKGc3vq4AbuEGv3DtP3sa8L2kpbA5o2FuRQ6Q8QNJmFA+O/NZpvc0lLmg45hlBaI5ojSyB9M2LGd8naaMPjBXTrC8l4z7FGE9i9qaWPPBbHH5vTDI=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxXAHu0HLAQZPDLa97UTqeSPt7Ya/ahSDRjp1UHzAgdZE4FPFavPmFiPzNHUd2y/rLlLb57OtMSkWuM1hC2Z+QU2wtbPVp72kb8G2ykxyFjDGxtGmOedhBx9ayc8d+eJRGH9RYnTT9DnxcRsZGQzha4+OguyHBIulnE7xvhrsBb/Q49PlNIr9RI9zskUxUQxtkFi1HhgTKqs96q/eMI/1A6J+srTCJaqExpT85DFebBOKch6J3ufTmWEQewxfBWE+N6BzLdzmaD09OjVpctVd3lbOkEXV7JRdJKiSlnm2LRSre2ieOYsyP7xDcTEG4VWRTtOBXwScN9qyQQc53r/hzQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关（测试环境）
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关(正式线上环境)
		//public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

