package org.example.nowscan.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HashAdviceTest {

    HashAdvice hashAdvice = new HashAdvice();

    @Test
    void 해시_테스트() {
        String 해시값_테스트 = hashAdvice.generateHash("해시값 테스트");
        System.out.println("해시값_테스트 = " + 해시값_테스트);
    }

    @Test
    void 해시_테스트_2() {
        String test = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at volutpat tellus. Proin metus magna, posuere sed venenatis non, gravida sed dolor. Nullam sodales, sapien sed ornare accumsan, enim ligula tristique eros, eu posuere purus neque a quam. Donec rutrum in mi et vulputate. Nam bibendum, purus in rhoncus convallis, erat odio dignissim arcu, non porta sapien lorem mollis lacus. Nunc vel rhoncus tortor. Maecenas vitae metus magna. Vestibulum suscipit tempor felis non egestas. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris auctor laoreet mauris, a auctor diam aliquet vehicula. Integer lacinia id dui non pretium. Maecenas dictum enim vel pulvinar eleifend. Morbi nec justo lacus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Sed sapien lacus, convallis eget volutpat ut, facilisis eget mauris. Nunc diam neque, tempor in semper vel, interdum ac dui.\n" +
                "\n" +
                "Proin ex risus, facilisis a porttitor vitae, molestie et dui. Vivamus rutrum feugiat metus, sed dignissim purus. Curabitur egestas, elit vitae tincidunt scelerisque, tellus arcu congue urna, ut auctor urna magna imperdiet augue. Nullam cursus orci nec tellus molestie, non imperdiet mi lacinia. Fusce sit amet semper tellus. Etiam metus ligula, posuere a condimentum id, tempus at augue. Ut gravida tortor in purus mattis viverra. Nulla eu justo sed libero pretium rutrum vitae a turpis.\n" +
                "\n" +
                "Pellentesque scelerisque justo eu tellus porttitor, lacinia finibus leo rutrum. Quisque libero massa, cursus laoreet sapien ut, malesuada egestas nunc. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce non commodo tellus, eu congue nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Maecenas in viverra augue, et iaculis lorem. Praesent ligula ipsum, sagittis ac purus ac, blandit accumsan felis. Suspendisse sollicitudin orci nibh, eu tempor libero volutpat vel. Suspendisse et massa eu neque molestie ornare commodo pulvinar turpis. Donec in dolor ac augue maximus pharetra sed a lacus. Duis tincidunt, libero at accumsan gravida, augue sapien eleifend odio, eget molestie libero justo ut orci. Donec dui neque, tincidunt id posuere eu, cursus fringilla arcu. Praesent condimentum purus et massa dapibus molestie. Maecenas rutrum pellentesque elit vitae fermentum. Praesent metus ligula, sollicitudin eget massa ac, lobortis faucibus purus. Nam gravida tristique euismod.\n" +
                "\n" +
                "In vitae enim non nisi vestibulum dapibus sit amet ut lacus. Quisque sagittis nulla quis ex scelerisque, eu iaculis sem luctus. Donec euismod metus sit amet magna auctor dictum. Sed eu aliquet velit. Sed blandit nisi vitae imperdiet rutrum. Aenean id sapien sed magna facilisis malesuada. Curabitur mauris mauris, elementum eu eros eu, pretium mattis enim. Sed at consectetur velit. Nulla hendrerit luctus nisl, id aliquet risus consectetur vitae. Pellentesque convallis lacus sit amet massa rhoncus, sed faucibus quam congue. Morbi a vestibulum enim. Integer quis mi et ante feugiat viverra. Nulla eu pretium arcu, id volutpat eros. Maecenas accumsan non nisi vitae ultricies. Pellentesque porta velit non justo porttitor maximus.\n" +
                "\n" +
                "Curabitur non ipsum faucibus, posuere risus eu, sodales arcu. Aenean pellentesque tortor ultrices risus pellentesque, vel tempor mauris rutrum. Etiam ac erat velit. Proin cursus bibendum est, nec feugiat orci. Donec in lacinia sem. Fusce eget convallis dolor. Integer in dui eu lacus condimentum eleifend. Duis tincidunt libero sit amet tortor varius, eget hendrerit tellus dictum. Integer facilisis eros in dignissim ullamcorper. Quisque viverra dolor orci, euismod placerat nisl sodales ut. Vestibulum efficitur mi tincidunt, commodo ipsum ut, vehicula metus. Nullam scelerisque justo sed imperdiet pretium. Donec aliquam nulla id mi pellentesque, vel pellentesque lacus maximus. Maecenas volutpat arcu et elementum lacinia.";

        String test2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut at volutpat tellus. Proin metus magna, posuere sed venenatis non, gravida sed dolor. Nullam sodales, sapien sed ornare accumsan, enim ligula tristique eros, eu posuere purus neque a quam. Donec rutrum in mi et vulputate. Nam bibendum, purus in rhoncus convallis, erat odio dignissim arcu, non porta sapien lorem mollis lacus. Nunc vel rhoncus tortor. Maecenas vitae metus magna. Vestibulum suscipit tempor felis non egestas. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris auctor laoreet mauris, a auctor diam aliquet vehicula. Integer lacinia id dui non pretium. Maecenas dictum enim vel pulvinar eleifend. Morbi nec justo lacus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Sed sapien lacus, convallis eget volutpat ut, facilisis eget mauris. Nunc diam neque, tempor in semper vel, interdum ac dui.\n" +
                "\n" +
                "Proin ex risus, facilisis a porttitor vitae, molestie et dui. Vivamus rutrum feugiat metus, sed dignissim purus. Curabitur egestas, elit vitae tincidunt scelerisque, tellus arcu congue urna, ut auctor urna magna imperdiet augue. Nullam cursus orci nec tellus molestie, non imperdiet mi lacinia. Fusce sit amet semper tellus. Etiam metus ligula, posuere a condimentum id, tempus at augue. Ut gravida tortor in purus mattis viverra. Nulla eu justo sed libero pretium rutrum vitae a turpis.\n" +
                "\n" +
                "Pellentesque scelerisque justo eu tellus porttitor, lacinia finibus leo rutrum. Quisque libero massa, cursus laoreet sapien ut, malesuada egestas nunc. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce non commodo tellus, eu congue nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Maecenas in viverra augue, et iaculis lorem. Praesent ligula ipsum, sagittis ac purus ac, blandit accumsan felis. Suspendisse sollicitudin orci nibh, eu tempor libero volutpat vel. Suspendisse et massa eu neque molestie ornare commodo pulvinar turpis. Donec in dolor ac augue maximus pharetra sed a lacus. Duis tincidunt, libero at accumsan gravida, augue sapien eleifend odio, eget molestie libero justo ut orci. Donec dui neque, tincidunt id posuere eu, cursus fringilla arcu. Praesent condimentum purus et massa dapibus molestie. Maecenas rutrum pellentesque elit vitae fermentum. Praesent metus ligula, sollicitudin eget massa ac, lobortis faucibus purus. Nam gravida tristique euismod.\n" +
                "\n" +
                "In vitae enim non nisi vestibulum dapibus sit amet ut lacus. Quisque sagittis nulla quis ex scelerisque, eu iaculis sem luctus. Donec euismod metus sit amet magna auctor dictum. Sed eu aliquet velit. Sed blandit nisi vitae imperdiet rutrum. Aenean id sapien sed magna facilisis malesuada. Curabitur mauris mauris, elementum eu eros eu, pretium mattis enim. Sed at consectetur velit. Nulla hendrerit luctus nisl, id aliquet risus consectetur vitae. Pellentesque convallis lacus sit amet massa rhoncus, sed faucibus quam congue. Morbi a vestibulum enim. Integer quis mi et ante feugiat viverra. Nulla eu pretium arcu, id volutpat eros. Maecenas accumsan non nisi vitae ultricies. Pellentesque porta velit non justo porttitor maximus.\n" +
                "\n" +
                "Curabitur non ipsum faucibus, posuere risus eu, sodales arcu. Aenean pellentesque tortor ultrices risus pellentesque, vel tempor mauris rutrum. Etiam ac erat velit. Proin cursus bibendum est, nec feugiat orci. Donec in lacinia sem. Fusce eget convallis dolor. Integer in dui eu lacus condimentum eleifend. Duis tincidunt libero sit amet tortor varius, eget hendrerit tellus dictum. Integer facilisis eros in dignissim ullamcorper. Quisque viverra dolor orci, euismod placerat nisl sodales ut. Vestibulum efficitur mi tincidunt, commodo ipsum ut, vehicula metus. Nullam scelerisque justo sed imperdiet pretium. Donec aliquam nulla id mi pellentesque, vel pellentesque lacus maximus. Maecenas volutpat arcu et elementum lacinia.";


        String hash = hashAdvice.generateHash(test);
        String hash2 = hashAdvice.generateHash(test2);

        assertThat(hash).isEqualTo(hash2);

    }
}
