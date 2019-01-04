package com.hulukeji.forlife.Course;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hulukeji.forlife.R;

public class DirectionFragment extends Fragment {
    private TextView direct;
    private String direction;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_direction,null);
        //获取数据
        direction = "街舞（Street Dance或 Street dancing）诞生于二十世纪六十年代末，是美国黑人城市贫民的舞蹈，到了七十年代它被归纳为嘻哈文化（Hip-Hop Culture）的一部分，具有较强的表演性，参与性和竞争性。\\n\" +\n" +
                "                \"1992年初期，出现了一种“原地性的HIP-HOP”，它没有那些大幅度的动作和脚步移动，更没有霹雳舞中那些在地上类似体操的动作。它的独有风格在于注重身体的协调性，重视身体上半身的律动及增加了许多头部、手部的动作。我们在迈克·杰克逊、玛丽亚·凯利、后街男孩的MTV中都可看到这种新风格的舞蹈。以动作形态来看，街舞舞者分两大类：Dancer和Bboy（BGIRL）。\\n\" +\n" +
                "                \"以表演形态来看，街舞舞者分两大类：一种是个人的技巧街舞，另外一种就是集体街舞。个人技巧街舞是最早流行的一种街舞，因为它能体现年轻人精力旺盛的一面，他们的很多地面动作，譬如说翻滚、倒立、弹跳都是比较高技巧，观赏性比较高的街舞表演。集体街舞是比较流行的街舞形式，它反映了大众的需要，跳起来比较简单，节奏感比较强，它既有舞蹈的感觉又有健身的作用。\\n\" +\n" +
                "                \"常见种类\\n\" +\n" +
                "                \"Locking（锁舞）起源于60年代，由Don Cambell领衔的The Lockers团队发明，是最早成型的街舞舞种。手腕手臂的快速旋转与指向，动作的突然定格，伴以各种拍手、跳跃及劈叉等技术为其主要特征。\\n\" +\n" +
                "                \"Popping（震感舞）起源于70年代初成型于70年代中后期，以不同形式兴起于美国西岸加尼福尼亚州的旧金山、弗雷斯诺、奥克兰等地，是Funk和Street Dance中的一种风格，最初的基本形式是借由各部位肌肉迅速地收缩与放松的技巧，是舞者的身体产生震动的感觉。\\n\" +\n" +
                "                \"Breaking（霹雳舞）起源于70年代并成型于80年代的美国纽约市的布朗克斯区，是一种难度较高的街舞舞种，比较重视舞步和技巧的结合，分为TopRock、Footwork、Freeze、Powermove四大内容。\\n\" +\n" +
                "                \"Hip-Hop（嘻哈舞）起源于80年代末90年代初，是继Breaking之后的第二种Hiphop舞蹈，是现在广泛流行的街舞类型，嘻哈舞最开始的原本意指B-Boy，后来才有人用MC唱的歌来跳舞，所以说跳Hip-Hop其实是一种后来的说法，B-Boy才是Hip-Hop的起源。\\n\" +\n" +
                "                \"House成型于80到90年代，广泛吸收Breaking、Hiphop、Salsa、Tap、Ballet等等各种不同舞蹈元素，形成了以丰富轻快的脚步变化来表现House舞曲的舞蹈种类，分为Jacking，Footwork和Lofting三大类内容。\\n\" +\n" +
                "                \"Reggae、Dancehall（雷鬼）此舞种起源于牙买加，并随着雷鬼音乐在法国及美国的传播和发展开始走进流行文化和公众视野，动作热情而狂野，带有大量的性暗示动作内容。\\n\" +\n" +
                "                \"Clown、Krump（小丑舞）于90年代初由Tommy The Clown发明，以小丑装扮进行舞蹈，风格上与Hiphop相似但狂野和夸张得多。其弟子Lil C、Tight Eyez等人脱离团队后自立门户，将Clown舞蹈进行大量改变并称之为Krump，寓意Kingdom Radically Uplifted Mighty Praise，并解释为一种通过激烈动作将内在负面情绪进行发泄和升华的赞扬神的舞蹈。\\n\" +\n" +
                "                \"Waacking、Punking、Voguing（甩舞）成型于70年代，原本是美国西岸地下Gay吧异装的男同性恋的舞台舞蹈，以大量手臂的旋转挥舞和风骚的Pose、走位来表达Disco及Funk音乐。Punking原指Locking舞者表演的Waacking，而Voguing是Waacking在美国东岸以House音乐表现并特别突出模特的Pose感的形式。\\n\" +\n" +
                "                \"Turfing出现于美国西岸，以手臂在肩膀等关节处进行非人类的扭曲（Bonebreak）为主要特点，大量结合Popping和相关的Robot、Wave、Kingtut、Slide、Slowmotion等Style和技术，以及芭蕾、Breaking等舞蹈的身体旋转和翻转，形成的一种诡异夸张的新兴街舞舞种。\\n\" +\n" +
                "                \"JAZZ（爵士舞）爵士舞是一种急促又富动感的节奏型舞蹈，是属于一种外放性的舞蹈，不像古典芭蕾舞或现代舞所表现的一种内敛性的舞蹈";
        //findView
        direct = view.findViewById(R.id.direction);
        //set
        direct.setText(direction);


        return view;
    }
}
