该开源工具支持的功能如下：
1.奔溃信息的捕获和显示，你可以查阅任何时候发生的奔溃信息。
2.修改请求地址，想必很多人开发的时候都遇到过这个问题，每次服务端同学想要测试一下新的地址的接口，客户端的同学都要在代码里面手动修改一下请求地址，并重新打包，这个过程比较麻烦。集成的了这个工具之后，你就可以动态的修改当前的请求地址。
3.设备信息的显示。
4.集成该开源工具后，会在桌面生成测试工具入口icon，以上功能都是在这个测试工具入口内实现。
5.其他功能有待完善


集成方法：
1.在你的工程里面添加代码compile project(':testkit')，引用该module。
2.在你的Application里面添加TestKitManager.getInstance().init(this);完成初始化
3.调用如下方法，在回调方法里面修改请求地址。
TestKitManager.getInstance().setOnAddressChangeListener(new OnAddressChangeListener() {
            @Override
            public void onAddressChange(String address) {
                requestUrl = address;
            }
        });
        
调用如下方法可以显示当前请求的地址
TestKitManager.getInstance().setCurrentAddress(requestUrl);

具体功能实现可下载demo观看
