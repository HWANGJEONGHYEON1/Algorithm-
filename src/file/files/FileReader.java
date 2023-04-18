package file.files;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FileReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // 2. Set을 생성합니다.
        Set<String> jsonSet = new HashSet<>();
        String filePath;
        // 3. 12개의 JSON 파일을 반복문을 통해 읽어옵니다.
        for (int i = 1; i <= 12; i++) {
            // 파일 경로를 생성합니다
            if (i < 10) {
                filePath = "/Users/we/study/algorithm/algorithm/src/file/files/0" + i + "c.txt";
            } else {
                filePath =  "/Users/we/study/algorithm/algorithm/src/file/files/" + i + "c.txt";
            }

            // 파일을 읽어와서 Set으로 파싱합니다.
            Set<String> set = objectMapper.readValue(new File(filePath), new TypeReference<>() {
            });

            // 기존 Set에 파싱한 Set을 추가합니다.
            jsonSet.addAll(set);
        }

        Set<String> collect = jsonSet.stream()
                .filter(api -> !api.startsWith("/partner/inquiries"))
                .filter(api -> !api.startsWith("/inquiries"))
                .filter(api -> !api.startsWith("/admin/inquiries"))
                .filter(api -> !api.startsWith("/w/qna"))
                .collect(Collectors.toSet());
        // 4. 결과를 출력합니다.
        String s = objectMapper.writeValueAsString(collect);
        System.out.println(s);
        System.out.println(collect.size());
    }
}
