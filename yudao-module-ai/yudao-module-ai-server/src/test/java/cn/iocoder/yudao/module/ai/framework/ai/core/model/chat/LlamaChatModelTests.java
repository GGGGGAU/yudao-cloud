package cn.iocoder.yudao.module.ai.framework.ai.core.model.chat;

import org.springframework.ai.ollama.OllamaChatModel;

/**
 * {@link OllamaChatModel} 集成测试
 *
 * @author 芋道源码
 */
public class LlamaChatModelTests {

//    private final OllamaChatModel chatModel = OllamaChatModel.builder()
//            .ollamaApi(new OllamaApi("http://127.0.0.1:11434")) // Ollama 服务地址
//            .defaultOptions(OllamaOptions.builder()
//                    .model(OllamaModel.LLAMA3.getName()) // 模型
//                    .build())
//            .build();
//
//    @Test
//    @Disabled
//    public void testCall() {
//        // 准备参数
//        List<Message> messages = new ArrayList<>();
//        messages.add(new SystemMessage("你是一个优质的文言文作者，用文言文描述着各城市的人文风景。"));
//        messages.add(new UserMessage("1 + 1 = ？"));
//
//        // 调用
//        ChatResponse response = chatModel.call(new Prompt(messages));
//        // 打印结果
//        System.out.println(response);
//        System.out.println(response.getResult().getOutput());
//    }
//
//    @Test
//    @Disabled
//    public void testStream() {
//        // 准备参数
//        List<Message> messages = new ArrayList<>();
//        messages.add(new SystemMessage("你是一个优质的文言文作者，用文言文描述着各城市的人文风景。"));
//        messages.add(new UserMessage("1 + 1 = ？"));
//
//        // 调用
//        Flux<ChatResponse> flux = chatModel.stream(new Prompt(messages));
//        // 打印结果
//        flux.doOnNext(response -> {
////            System.out.println(response);
//            System.out.println(response.getResult().getOutput());
//        }).then().block();
//    }

}
