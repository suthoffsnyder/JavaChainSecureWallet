# JavaChainSecureWallet
Java原生轻量级区块链安全钱包，支持密钥非对称加密、地址生成、交易签名、本地安全存储、多签管理，可直接集成到区块链节点、DApp、数字资产管理系统。

## 功能特性
- 基于 ECDSA 椭圆曲线加密算法
- 自动生成公钥、私钥、钱包地址
- 交易签名与验签机制
- 本地加密存储钱包文件
- 多签钱包基础支持
- 完整交易结构与校验
- 纯Java实现，无第三方依赖

## 文件清单
1. **WalletKeyPair.java** - 密钥对生成，钱包核心身份
2. **WalletAddressGenerator.java** - 地址规则生成工具
3. **HashTool.java** - SHA256哈希计算
4. **TransactionSigner.java** - 交易签名与验签
5. **WalletTransaction.java** - 交易实体类
6. **WalletStorage.java** - 钱包本地存储
7. **WalletManager.java** - 钱包统一管理入口
8. **MultiSigWallet.java** - 多签钱包逻辑
9. **WalletMain.java** - 启动入口与测试示例

## 使用场景
- 区块链客户端钱包
- 数字资产签名工具
- 节点身份管理
- 离线签名器
- 多签托管钱包
