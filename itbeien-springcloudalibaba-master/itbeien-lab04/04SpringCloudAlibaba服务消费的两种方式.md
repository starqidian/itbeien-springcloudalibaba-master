## SpringCloudAlibaba实现服务消费

## 1 服务消费

![](img/服务消费(聚合支付系统调用卡系统).png)

### 1.1 使用RestTemplate进行服务消费

- 添加 @LoadBlanced 注解，使得 RestTemplate 接入 Ribbon：

```java
@Bean
@LoadBalanced
public RestTemplate restTemplate() {
    return new RestTemplate();
}
```

- 配置一个 FeignClient，FeignClient 已经默认集成了 Ribbon ：

```java
@FeignClient(name = "card-service")
public interface CardService {
    @PostMapping(value = "/api/voucher-pay")
    String callVoucherPay(JSONObject data);
}
```

使用 @FeignClient 注解将 CardService 这个接口包装成一个 FeignClient，属性 name 对应服务名 card-service。

