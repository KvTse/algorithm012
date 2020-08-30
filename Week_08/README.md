PK  7�Q               meta.xml�v�<?xml version="1.0" encoding="UTF-8" standalone="no"?><meta xmlns="urn:xmind:xmap:xmlns:meta:2.0" version="2.0"><Author><Name>xieto</Name><Email/><Org/></Author><Create><Time>2020-8-30 16:32:00</Time></Create><Creator><Name>XMind</Name><Version>R3.7.9.201912052356</Version></Creator><Thumbnail><Origin><X>115</X><Y>340</Y></Origin><BackgroundColor>#FFFFFF</BackgroundColor></Thumbnail></meta>PK�-p��  �  PK  7�Q               content.xml2��<?xml version="1.0" encoding="UTF-8" standalone="no"?><xmap-content xmlns="urn:xmind:xmap:xmlns:content:2.0" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:svg="http://www.w3.org/2000/svg" xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xlink="http://www.w3.org/1999/xlink" modified-by="xieto" timestamp="1598801625949" version="2.0"><sheet id="6efkjpakvem8dhcuogog58m3e3" modified-by="xieto" theme="74fdtv20lt8ek6sr31h5t7a52o" timestamp="1598801625949"><topic id="4q78eop79gsu23ruat138kibnt" modified-by="xieto" structure-class="org.xmind.ui.map.unbalanced" timestamp="1598776528587"><title>排序算法</title><children><topics type="attached"><topic id="4r4948i33pn56tc9mn90ukd4k6" modified-by="xieto" timestamp="1598776320264"><title>比较类算法</title><children><topics type="attached"><topic id="5vpbslf6jonips9lh8pen0vu08" modified-by="xieto" timestamp="1598776464518"><title>1.交换排序</title><children><topics type="attached"><topic id="5e455p35t3j4urnab7d40vobc0" modified-by="xieto" timestamp="1598778596057"><title>1.冒泡排序</title><children><topics type="attached"><topic id="4lbgp6mmpm8uvlhos74gkv2cqg" modified-by="xieto" timestamp="1598776636604"><title>时间复杂度: O(n^2)</title></topic><topic id="1698vkou1ikb56446fmrdjsjum" modified-by="xieto" timestamp="1598776631718"><title>稳定性: 稳定</title></topic></topics></children><notes><html><xhtml:p>1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；</xhtml:p><xhtml:p>2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；</xhtml:p><xhtml:p>3.针对所有的元素重复以上的步骤，除了最后一个；</xhtml:p><xhtml:p/><xhtml:p>代码示例:</xhtml:p><xhtml:p>// 从第一个元素开始,依次比较两相邻元素,并比较其大小</xhtml:p><xhtml:p>        for (int i = 0; i &lt; descArray.length - 1; i++) {</xhtml:p><xhtml:p>            // 依次替换每个元素</xhtml:p><xhtml:p>            for (int j = 0; j &lt; descArray.length - 1 - i; j++) {</xhtml:p><xhtml:p>                // 交换位置</xhtml:p><xhtml:p>                if (descArray[j] &gt; descArray[j + 1]) {</xhtml:p><xhtml:p>                    int temp = descArray[j + 1];</xhtml:p><xhtml:p>                    descArray[j + 1] = descArray[j];</xhtml:p><xhtml:p>                    descArray[j] = temp;</xhtml:p><xhtml:p>                }</xhtml:p><xhtml:p>            }</xhtml:p><xhtml:p>        }</xhtml:p></html><plain>1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；&#13;
2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；&#13;
3.针对所有的元素重复以上的步骤，除了最后一个；&#13;
&#13;
代码示例:&#13;
// 从第一个元素开始,依次比较两相邻元素,并比较其大小&#13;
        for (int i = 0; i &lt; descArray.length - 1; i++) {&#13;
            // 依次替换每个元素&#13;
            for (int j = 0; j &lt; descArray.length - 1 - i; j++) {&#13;
                // 交换位置&#13;
                if (descArray[j] &gt; descArray[j + 1]) {&#13;
                    int temp = descArray[j + 1];&#13;
                    descArray[j + 1] = descArray[j];&#13;
                    descArray[j] = temp;&#13;
                }&#13;
            }&#13;
        }</plain></notes></topic><topic id="59jjneef4r70ftqee09u3fu27d" modified-by="xieto" timestamp="1598795085236"><title>2.快速排序</title><children><topics type="attached"><topic id="4gp78lqc9rimua5nv1jv8stsdn" modified-by="xieto" timestamp="1598794838877"><title>时间复杂度:O(nlogN)</title></topic><topic id="2k9v1a6npqd34qe1t32ut5962h" modified-by="xieto" timestamp="1598794853089"><title>稳定性: 不稳定</title></topic></topics></children><notes><html><xhtml:p>基本思想:</xhtml:p><xhtml:p>通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序.</xhtml:p><xhtml:p>1.从数列中挑出一个元素，称为 “基准”（pivot）；</xhtml:p><xhtml:p>2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。</xhtml:p><xhtml:p>3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序</xhtml:p></html><plain>基本思想:&#13;
通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序.&#13;
1.从数列中挑出一个元素，称为 “基准”（pivot）；&#13;
2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。&#13;
3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序</plain></notes></topic></topics></children></topic><topic id="5saa31kp7nqqtljbeunjb4um56" modified-by="xieto" timestamp="1598799004659"><title>2.插入排序</title><children><topics type="attached"><topic id="1e6p6hdrl8dt62oso2d4opafmk" modified-by="xieto" timestamp="1598800599918"><title>1.插入排序</title><notes><html><xhtml:p>原理:通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。</xhtml:p><xhtml:p>步骤:</xhtml:p><xhtml:p>1.从第一个元素开始，该元素可以认为已经被排序；</xhtml:p><xhtml:p>2.取出下一个元素，在已经排序的元素序列中从后向前扫描；</xhtml:p><xhtml:p>3.如果该元素（已排序）大于新元素，将该元素移到下一位置；</xhtml:p><xhtml:p>4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；</xhtml:p><xhtml:p>5.将新元素插入到该位置后；</xhtml:p><xhtml:p>6.重复2-5.</xhtml:p><xhtml:p>代码实现:</xhtml:p><xhtml:p>private void insertionSort(int[] descArray) {</xhtml:p><xhtml:p>        int preIndex ;</xhtml:p><xhtml:p>        int current;</xhtml:p><xhtml:p>        for (int i = 1; i &lt; descArray.length; i++) {</xhtml:p><xhtml:p>            preIndex = i-1;</xhtml:p><xhtml:p>            current = descArray[i];</xhtml:p><xhtml:p>            while(preIndex &gt;= 0 &amp;&amp; descArray[preIndex] &gt; current){</xhtml:p><xhtml:p>                descArray[preIndex+1] = descArray[preIndex];</xhtml:p><xhtml:p>                preIndex--;</xhtml:p><xhtml:p>            }</xhtml:p><xhtml:p>            // 插入当前元素,while循环中多减了一次</xhtml:p><xhtml:p>            descArray[preIndex+1] = current;</xhtml:p><xhtml:p>        }</xhtml:p><xhtml:p/><xhtml:p>    }</xhtml:p></html><plain>原理:通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。&#13;
步骤:&#13;
1.从第一个元素开始，该元素可以认为已经被排序；&#13;
2.取出下一个元素，在已经排序的元素序列中从后向前扫描；&#13;
3.如果该元素（已排序）大于新元素，将该元素移到下一位置；&#13;
4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；&#13;
5.将新元素插入到该位置后；&#13;
6.重复2-5.&#13;
代码实现:&#13;
private void insertionSort(int[] descArray) {&#13;
        int preIndex ;&#13;
        int current;&#13;
        for (int i = 1; i &lt; descArray.length; i++) {&#13;
            preIndex = i-1;&#13;
            current = descArray[i];&#13;
            while(preIndex &gt;= 0 &amp;&amp; descArray[preIndex] &gt; current){&#13;
                descArray[preIndex+1] = descArray[preIndex];&#13;
                preIndex--;&#13;
            }&#13;
            // 插入当前元素,while循环中多减了一次&#13;
            descArray[preIndex+1] = current;&#13;
        }&#13;
&#13;
    }</plain></notes><children><topics type="attached"><topic id="7fp25do85tapmmqf82upiuvoq5" modified-by="xieto" timestamp="1598800333059"><title>时间复杂度:O(n^2)</title></topic><topic id="2qk57u8826ngjmo53dl7hk9rkt" modified-by="xieto" timestamp="1598800346949"><title>稳定性:稳定</title></topic></topics></children></topic><topic id="64673qnme91jsa1a3jnl8qgnq0" modified-by="xieto" timestamp="1598800561584"><title>2.希尔排序</title><marker-refs><marker-ref marker-id="flag-red"/></marker-refs><labels><label>TODO</label></labels></topic></topics></children></topic><topic id="4fpjk3brg2ud6jar6cco94ace6" modified-by="xieto" timestamp="1598799052164"><title>3.选择排序</title><children><topics type="attached"><topic id="1gad1o9eoelhs927rmdbg9d3vu" modified-by="xieto" timestamp="1598801625949"><title>1.选择排序</title><notes><html><xhtml:p>首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。</xhtml:p><xhtml:p>代码实现:</xhtml:p><xhtml:p>private void selectionSort(int[] descArray) {</xhtml:p><xhtml:p>        int currentMinimumIndex ;</xhtml:p><xhtml:p>        // 所有的元素</xhtml:p><xhtml:p>        for (int i = 0; i &lt; descArray.length - 1; i++) {</xhtml:p><xhtml:p>            // 未排序的元素</xhtml:p><xhtml:p>            currentMinimumIndex = i;</xhtml:p><xhtml:p>            for (int j = i+1; j &lt; descArray.length; j++) {</xhtml:p><xhtml:p>                // 从未排序的元素中,选出最小元素所在位置</xhtml:p><xhtml:p>                if (descArray[j] &lt; descArray[currentMinimumIndex]){</xhtml:p><xhtml:p>                    currentMinimumIndex = j;</xhtml:p><xhtml:p>                }</xhtml:p><xhtml:p>            }</xhtml:p><xhtml:p>            // 交换位置,当前未排序的位置和未排序的最小值位置替换</xhtml:p><xhtml:p>            swap(descArray,i,currentMinimumIndex);</xhtml:p><xhtml:p>        }</xhtml:p><xhtml:p/><xhtml:p>    }</xhtml:p></html><plain>首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。&#13;
代码实现:&#13;
private void selectionSort(int[] descArray) {&#13;
        int currentMinimumIndex ;&#13;
        // 所有的元素&#13;
        for (int i = 0; i &lt; descArray.length - 1; i++) {&#13;
            // 未排序的元素&#13;
            currentMinimumIndex = i;&#13;
            for (int j = i+1; j &lt; descArray.length; j++) {&#13;
                // 从未排序的元素中,选出最小元素所在位置&#13;
                if (descArray[j] &lt; descArray[currentMinimumIndex]){&#13;
                    currentMinimumIndex = j;&#13;
                }&#13;
            }&#13;
            // 交换位置,当前未排序的位置和未排序的最小值位置替换&#13;
            swap(descArray,i,currentMinimumIndex);&#13;
        }&#13;
&#13;
    }</plain></notes><children><topics type="attached"><topic id="02k81b93e9dpsmnd2a59th60t4" modified-by="xieto" timestamp="1598800780520"><title>时间复杂度: O(n^2)</title></topic><topic id="307rgn9vlvnapk20fhe07foj9e" modified-by="xieto" timestamp="1598800771935"><title>稳定性:不稳定</title></topic></topics></children></topic><topic id="328gpiffus1hb7moi9pm10ccj9" modified-by="xieto" timestamp="1598799067736"><title>2.堆排序</title></topic></topics></children></topic><topic id="50ebmnmuijpcr0v3vrnff9ien8" modified-by="xieto" timestamp="1598800570857"><title>4.归并排序</title></topic></topics></children></topic><topic id="14jh3ap79ij7qras2f2a5rueij" modified-by="xieto" timestamp="1598776320265"><title>非比较类算法</title><children><topics type="attached"><topic id="622f94k3lnk5d52f6ogsns1ih0" modified-by="xieto" timestamp="1598776320265"><title>1.计数排序</title></topic><topic id="3omi5bbg39796eqbkdj3ebmc1i" modified-by="xieto" timestamp="1598776320265"><title>2.桶排序</title></topic><topic id="60e3u3act8p903hrdapg9oai1o" modified-by="xieto" timestamp="1598776320265"><title>3.计数排序</title></topic></topics></children></topic></topics></children><extensions><extension provider="org.xmind.ui.map.unbalanced"><content><right-number>2</right-number></content></extension></extensions></topic><title>画布 1</title></sheet></xmap-content>PK�/˶!2  2  PK  7�Q            
   styles.xml/��<?xml version="1.0" encoding="UTF-8" standalone="no"?><xmap-styles xmlns="urn:xmind:xmap:xmlns:style:2.0" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:svg="http://www.w3.org/2000/svg" version="2.0"><automatic-styles><style id="05nu6r4ouu4jv4usdfu8ac1faj" name="" type="summary"><summary-properties line-color="#5C99D4"/></style><style id="4jfc254fam7sifuqmviveid8fk" name="" type="topic"><topic-properties fo:color="#7F7F7F" fo:font-family="Microsoft YaHei" fo:font-size="10pt" svg:fill="none"/></style><style id="0baqr6uj6vqb46c4jd9i92t1at" name="" type="boundary"><boundary-properties fo:color="#FFFFFF" fo:font-family="Microsoft YaHei" fo:font-size="10pt" fo:font-style="italic" line-color="#82BAE1" line-pattern="dash" line-width="2pt" shape-class="org.xmind.boundaryShape.scallops" svg:fill="#82BAE1" svg:opacity=".5"/></style><style id="0ukre8j7epbrqctq9740g2re3v" name="" type="topic"><topic-properties border-line-color="#0A5CB9" border-line-width="0pt" callout-shape-class="org.xmind.calloutTopicShape.balloon.roundedRect" fo:color="#FFFFFF" fo:font-family="Microsoft YaHei" fo:font-style="italic" line-class="org.xmind.branchConnection.roundedElbow" svg:fill="#6EAADC"/></style><style id="109222a6qavdeuk1h76dcea30l" name="" type="topic"><topic-properties border-line-color="#0A5CB9" border-line-width="3pt" fo:color="#0A5CB9" fo:font-family="Microsoft YaHei" fo:font-size="20pt" fo:font-weight="normal" fo:text-align="center" fo:text-transform="uppercase" line-class="org.xmind.branchConnection.curve" line-color="#0A5CB9" line-width="2pt" shape-class="org.xmind.topicShape.roundedRect" svg:fill="#FFFFFF"/></style><style id="55k3nt8q5vh72hjud0qnhaim36" name="" type="topic"><topic-properties border-line-color="#0D46AA" border-line-width="2pt" fo:color="#0A5CB9" fo:font-family="Microsoft YaHei" fo:font-size="14pt" fo:text-transform="uppercase" line-width="1pt" svg:fill="#FFFFFF"/></style><style id="39mqhdvs1f9vremjr5udp3nf5m" name="" type="topic"><topic-properties border-line-width="0pt" fo:color="#376092" fo:font-family="Microsoft YaHei" fo:font-size="12pt" fo:font-style="italic" line-class="org.xmind.branchConnection.none" shape-class="org.xmind.topicShape.ellipse" svg:fill="none"/></style><style id="3ggru5ef150m2e71c9p8tddnua" name="" type="relationship"><relationship-properties arrow-begin-class="org.xmind.arrowShape.none" arrow-end-class="org.xmind.arrowShape.triangle" fo:color="#0A5CB9" fo:font-family="Microsoft YaHei" fo:font-size="11pt" fo:font-style="italic" line-color="#0A5CB9" line-pattern="dash" line-width="2pt" shape-class="org.xmind.relationshipShape.curved"/></style><style id="3eur7a50u8g4r7sktjlmfi5nj8" name="" type="topic"><topic-properties border-line-width="1pt" fo:color="#558ED5" fo:font-family="Microsoft YaHei" fo:font-style="italic" fo:font-weight="normal" line-class="org.xmind.branchConnection.elbow" line-color="#0D46AA" line-width="1pt" shape-class="org.xmind.topicShape.rect" svg:fill="#FFFFFF"/></style><style id="3816cg11l4ve0n9bk6k0nfq80h" name="" type="map"><map-properties background="" color-gradient="none" line-tapered="none" multi-line-colors="none" svg:fill="#FFFFFF" svg:opacity="1.0"/></style></automatic-styles><master-styles><style id="74fdtv20lt8ek6sr31h5t7a52o" name="商业 I" type="theme"><theme-properties><default-style style-family="summary" style-id="05nu6r4ouu4jv4usdfu8ac1faj"/><default-style style-family="subTopic" style-id="4jfc254fam7sifuqmviveid8fk"/><default-style style-family="boundary" style-id="0baqr6uj6vqb46c4jd9i92t1at"/><default-style style-family="calloutTopic" style-id="0ukre8j7epbrqctq9740g2re3v"/><default-style style-family="centralTopic" style-id="109222a6qavdeuk1h76dcea30l"/><default-style style-family="mainTopic" style-id="55k3nt8q5vh72hjud0qnhaim36"/><default-style style-family="summaryTopic" style-id="39mqhdvs1f9vremjr5udp3nf5m"/><default-style style-family="relationship" style-id="3ggru5ef150m2e71c9p8tddnua"/><default-style style-family="floatingTopic" style-id="3eur7a50u8g4r7sktjlmfi5nj8"/><default-style style-family="map" style-id="3816cg11l4ve0n9bk6k0nfq80h"/></theme-properties></style></master-styles></xmap-styles>PK_s�4  /  PK  7�Q            2   Revisions/6efkjpakvem8dhcuogog58m3e3/revisions.xmlq��<?xml version="1.0" encoding="UTF-8" standalone="no"?><xmap-revisions media-type="application/vnd.xmind.sheet" next-rev-num="13" resource-id="6efkjpakvem8dhcuogog58m3e3"><revision creator-name="XMind" creator-version="R3.7.9.201912052356" resource="Revisions/6efkjpakvem8dhcuogog58m3e3/rev-12-1598801625999.xml" rev-num="12" timestamp="1598801625999"/></xmap-revisions>PK��!uv  q  PK  7�Q            =   Revisions/6efkjpakvem8dhcuogog58m3e3/rev-12-1598801625999.xml2��<?xml version="1.0" encoding="UTF-8" standalone="no"?><xmap-revision-content xmlns="urn:xmind:xmap:xmlns:revision:1.0" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:svg="http://www.w3.org/2000/svg" xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xlink="http://www.w3.org/1999/xlink"><sheet id="6efkjpakvem8dhcuogog58m3e3" modified-by="xieto" theme="74fdtv20lt8ek6sr31h5t7a52o" timestamp="1598801625949" xmlns="urn:xmind:xmap:xmlns:content:2.0"><topic id="4q78eop79gsu23ruat138kibnt" modified-by="xieto" structure-class="org.xmind.ui.map.unbalanced" timestamp="1598776528587"><title>排序算法</title><children><topics type="attached"><topic id="4r4948i33pn56tc9mn90ukd4k6" modified-by="xieto" timestamp="1598776320264"><title>比较类算法</title><children><topics type="attached"><topic id="5vpbslf6jonips9lh8pen0vu08" modified-by="xieto" timestamp="1598776464518"><title>1.交换排序</title><children><topics type="attached"><topic id="5e455p35t3j4urnab7d40vobc0" modified-by="xieto" timestamp="1598778596057"><title>1.冒泡排序</title><children><topics type="attached"><topic id="4lbgp6mmpm8uvlhos74gkv2cqg" modified-by="xieto" timestamp="1598776636604"><title>时间复杂度: O(n^2)</title></topic><topic id="1698vkou1ikb56446fmrdjsjum" modified-by="xieto" timestamp="1598776631718"><title>稳定性: 稳定</title></topic></topics></children><notes><html><xhtml:p>1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；</xhtml:p><xhtml:p>2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；</xhtml:p><xhtml:p>3.针对所有的元素重复以上的步骤，除了最后一个；</xhtml:p><xhtml:p/><xhtml:p>代码示例:</xhtml:p><xhtml:p>// 从第一个元素开始,依次比较两相邻元素,并比较其大小</xhtml:p><xhtml:p>        for (int i = 0; i &lt; descArray.length - 1; i++) {</xhtml:p><xhtml:p>            // 依次替换每个元素</xhtml:p><xhtml:p>            for (int j = 0; j &lt; descArray.length - 1 - i; j++) {</xhtml:p><xhtml:p>                // 交换位置</xhtml:p><xhtml:p>                if (descArray[j] &gt; descArray[j + 1]) {</xhtml:p><xhtml:p>                    int temp = descArray[j + 1];</xhtml:p><xhtml:p>                    descArray[j + 1] = descArray[j];</xhtml:p><xhtml:p>                    descArray[j] = temp;</xhtml:p><xhtml:p>                }</xhtml:p><xhtml:p>            }</xhtml:p><xhtml:p>        }</xhtml:p></html><plain>1.比较相邻的元素。如果第一个比第二个大，就交换它们两个；&#13;
2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；&#13;
3.针对所有的元素重复以上的步骤，除了最后一个；&#13;
&#13;
代码示例:&#13;
// 从第一个元素开始,依次比较两相邻元素,并比较其大小&#13;
        for (int i = 0; i &lt; descArray.length - 1; i++) {&#13;
            // 依次替换每个元素&#13;
            for (int j = 0; j &lt; descArray.length - 1 - i; j++) {&#13;
                // 交换位置&#13;
                if (descArray[j] &gt; descArray[j + 1]) {&#13;
                    int temp = descArray[j + 1];&#13;
                    descArray[j + 1] = descArray[j];&#13;
                    descArray[j] = temp;&#13;
                }&#13;
            }&#13;
        }</plain></notes></topic><topic id="59jjneef4r70ftqee09u3fu27d" modified-by="xieto" timestamp="1598795085236"><title>2.快速排序</title><children><topics type="attached"><topic id="4gp78lqc9rimua5nv1jv8stsdn" modified-by="xieto" timestamp="1598794838877"><title>时间复杂度:O(nlogN)</title></topic><topic id="2k9v1a6npqd34qe1t32ut5962h" modified-by="xieto" timestamp="1598794853089"><title>稳定性: 不稳定</title></topic></topics></children><notes><html><xhtml:p>基本思想:</xhtml:p><xhtml:p>通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序.</xhtml:p><xhtml:p>1.从数列中挑出一个元素，称为 “基准”（pivot）；</xhtml:p><xhtml:p>2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。</xhtml:p><xhtml:p>3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序</xhtml:p></html><plain>基本思想:&#13;
通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，则可分别对这两部分记录继续进行排序，以达到整个序列有序.&#13;
1.从数列中挑出一个元素，称为 “基准”（pivot）；&#13;
2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。&#13;
3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序</plain></notes></topic></topics></children></topic><topic id="5saa31kp7nqqtljbeunjb4um56" modified-by="xieto" timestamp="1598799004659"><title>2.插入排序</title><children><topics type="attached"><topic id="1e6p6hdrl8dt62oso2d4opafmk" modified-by="xieto" timestamp="1598800599918"><title>1.插入排序</title><notes><html><xhtml:p>原理:通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。</xhtml:p><xhtml:p>步骤:</xhtml:p><xhtml:p>1.从第一个元素开始，该元素可以认为已经被排序；</xhtml:p><xhtml:p>2.取出下一个元素，在已经排序的元素序列中从后向前扫描；</xhtml:p><xhtml:p>3.如果该元素（已排序）大于新元素，将该元素移到下一位置；</xhtml:p><xhtml:p>4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；</xhtml:p><xhtml:p>5.将新元素插入到该位置后；</xhtml:p><xhtml:p>6.重复2-5.</xhtml:p><xhtml:p>代码实现:</xhtml:p><xhtml:p>private void insertionSort(int[] descArray) {</xhtml:p><xhtml:p>        int preIndex ;</xhtml:p><xhtml:p>        int current;</xhtml:p><xhtml:p>        for (int i = 1; i &lt; descArray.length; i++) {</xhtml:p><xhtml:p>            preIndex = i-1;</xhtml:p><xhtml:p>            current = descArray[i];</xhtml:p><xhtml:p>            while(preIndex &gt;= 0 &amp;&amp; descArray[preIndex] &gt; current){</xhtml:p><xhtml:p>                descArray[preIndex+1] = descArray[preIndex];</xhtml:p><xhtml:p>                preIndex--;</xhtml:p><xhtml:p>            }</xhtml:p><xhtml:p>            // 插入当前元素,while循环中多减了一次</xhtml:p><xhtml:p>            descArray[preIndex+1] = current;</xhtml:p><xhtml:p>        }</xhtml:p><xhtml:p/><xhtml:p>    }</xhtml:p></html><plain>原理:通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。&#13;
步骤:&#13;
1.从第一个元素开始，该元素可以认为已经被排序；&#13;
2.取出下一个元素，在已经排序的元素序列中从后向前扫描；&#13;
3.如果该元素（已排序）大于新元素，将该元素移到下一位置；&#13;
4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；&#13;
5.将新元素插入到该位置后；&#13;
6.重复2-5.&#13;
代码实现:&#13;
private void insertionSort(int[] descArray) {&#13;
        int preIndex ;&#13;
        int current;&#13;
        for (int i = 1; i &lt; descArray.length; i++) {&#13;
            preIndex = i-1;&#13;
            current = descArray[i];&#13;
            while(preIndex &gt;= 0 &amp;&amp; descArray[preIndex] &gt; current){&#13;
                descArray[preIndex+1] = descArray[preIndex];&#13;
                preIndex--;&#13;
            }&#13;
            // 插入当前元素,while循环中多减了一次&#13;
            descArray[preIndex+1] = current;&#13;
        }&#13;
&#13;
    }</plain></notes><children><topics type="attached"><topic id="7fp25do85tapmmqf82upiuvoq5" modified-by="xieto" timestamp="1598800333059"><title>时间复杂度:O(n^2)</title></topic><topic id="2qk57u8826ngjmo53dl7hk9rkt" modified-by="xieto" timestamp="1598800346949"><title>稳定性:稳定</title></topic></topics></children></topic><topic id="64673qnme91jsa1a3jnl8qgnq0" modified-by="xieto" timestamp="1598800561584"><title>2.希尔排序</title><marker-refs><marker-ref marker-id="flag-red"/></marker-refs><labels><label>TODO</label></labels></topic></topics></children></topic><topic id="4fpjk3brg2ud6jar6cco94ace6" modified-by="xieto" timestamp="1598799052164"><title>3.选择排序</title><children><topics type="attached"><topic id="1gad1o9eoelhs927rmdbg9d3vu" modified-by="xieto" timestamp="1598801625949"><title>1.选择排序</title><notes><html><xhtml:p>首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。</xhtml:p><xhtml:p>代码实现:</xhtml:p><xhtml:p>private void selectionSort(int[] descArray) {</xhtml:p><xhtml:p>        int currentMinimumIndex ;</xhtml:p><xhtml:p>        // 所有的元素</xhtml:p><xhtml:p>        for (int i = 0; i &lt; descArray.length - 1; i++) {</xhtml:p><xhtml:p>            // 未排序的元素</xhtml:p><xhtml:p>            currentMinimumIndex = i;</xhtml:p><xhtml:p>            for (int j = i+1; j &lt; descArray.length; j++) {</xhtml:p><xhtml:p>                // 从未排序的元素中,选出最小元素所在位置</xhtml:p><xhtml:p>                if (descArray[j] &lt; descArray[currentMinimumIndex]){</xhtml:p><xhtml:p>                    currentMinimumIndex = j;</xhtml:p><xhtml:p>                }</xhtml:p><xhtml:p>            }</xhtml:p><xhtml:p>            // 交换位置,当前未排序的位置和未排序的最小值位置替换</xhtml:p><xhtml:p>            swap(descArray,i,currentMinimumIndex);</xhtml:p><xhtml:p>        }</xhtml:p><xhtml:p/><xhtml:p>    }</xhtml:p></html><plain>首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。&#13;
代码实现:&#13;
private void selectionSort(int[] descArray) {&#13;
        int currentMinimumIndex ;&#13;
        // 所有的元素&#13;
        for (int i = 0; i &lt; descArray.length - 1; i++) {&#13;
            // 未排序的元素&#13;
            currentMinimumIndex = i;&#13;
            for (int j = i+1; j &lt; descArray.length; j++) {&#13;
                // 从未排序的元素中,选出最小元素所在位置&#13;
                if (descArray[j] &lt; descArray[currentMinimumIndex]){&#13;
                    currentMinimumIndex = j;&#13;
                }&#13;
            }&#13;
            // 交换位置,当前未排序的位置和未排序的最小值位置替换&#13;
            swap(descArray,i,currentMinimumIndex);&#13;
        }&#13;
&#13;
    }</plain></notes><children><topics type="attached"><topic id="02k81b93e9dpsmnd2a59th60t4" modified-by="xieto" timestamp="1598800780520"><title>时间复杂度: O(n^2)</title></topic><topic id="307rgn9vlvnapk20fhe07foj9e" modified-by="xieto" timestamp="1598800771935"><title>稳定性:不稳定</title></topic></topics></children></topic><topic id="328gpiffus1hb7moi9pm10ccj9" modified-by="xieto" timestamp="1598799067736"><title>2.堆排序</title></topic></topics></children></topic><topic id="50ebmnmuijpcr0v3vrnff9ien8" modified-by="xieto" timestamp="1598800570857"><title>4.归并排序</title></topic></topics></children></topic><topic id="14jh3ap79ij7qras2f2a5rueij" modified-by="xieto" timestamp="1598776320265"><title>非比较类算法</title><children><topics type="attached"><topic id="622f94k3lnk5d52f6ogsns1ih0" modified-by="xieto" timestamp="1598776320265"><title>1.计数排序</title></topic><topic id="3omi5bbg39796eqbkdj3ebmc1i" modified-by="xieto" timestamp="1598776320265"><title>2.桶排序</title></topic><topic id="60e3u3act8p903hrdapg9oai1o" modified-by="xieto" timestamp="1598776320265"><title>3.计数排序</title></topic></topics></children></topic></topics></children><extensions><extension provider="org.xmind.ui.map.unbalanced"><content><right-number>2</right-number></content></extension></extensions></topic><title>画布 1</title></sheet></xmap-revision-content>PKQ�5`!2  2  PK  7�Q               Thumbnails/thumbnail.pngah���PNG

   
IHDR  ]     �e�  h(IDATx��]��}���" �E�_�}0� W���"B�M�u��b�D��|�$+K!
��m�^@--!��F\�ט�.�IQ��MI������!w��h��-Q�C1sOwuW�SuN�9�������`�T�9��nՏ�����    ���Y�    @!�   �
^    m�B    h�   @�    ���    �/   �6x!    ��   �
^    m�B    h�  T����ZS�լ�X!��l���CɄE!�  ����le���-oo[����"42���@f��(���O$J�UY=u��d�J�  `���F6R����k��s��NG}�WO˼��r�w���B�k.p�P����x!  ���d����B��]��xǋp�u��B�L�9c��u>�z�XI���]àx++���x��2=�B  �#셍(�k+{�6?'��~����)��м!��?N�_c#��tx��';'�L��9e�  ��C���4J��x�]û庥��xj5��d_��2j�.5���ޖ����|��XC�W�B  �C��K�󅦾|�yL����^�i+�{;�g=T�/tQC�r"�Pk�M�x!  ���w�
T.�HN'g��UGfX$$��x����\�\j}��#���0��sM�   #��YIDE{�Y��FF�!���K�А�'+��J>�Q����   #����:�|����d�G0�&��̤�H9�/��B��^��*�   ��N��t�I�m\o�|�Al� l�,v<�y�IJ^ؽ`1YKڑ   �������(�LԬɣ7����������y�52��n�N��s��;  ��H��I��uk��}��f�`Y�{�m	U�')�J�A��l`WL��4�0� ��   @����#���]Sk4j�d��$b ���}�~ž��� ǨU��[���b��j(�Rxx!  @UP�$���9}'����m�5&��G��?O_��m�a H�+$�   텊O&�����u%c����dm�y9� @�膴�?|í�ʀ���mV,��;��/��Cy���[I��l&����^  �Ĥ0��͜���<���N��4�0vbc#�.���zg���������w�{�!�x!  �P:�Gd��٥�u��il0/�Z�Ͳq�~s�,�m/��gB
�7�
5��/  ~Ǫ�ƭ�� }��n=�[��M6���#L+�%G��l��;��a����Vf?M'V����  ��ZT�9LNF�
Z]�|a����
�h��?��J�� j8����z�K;����ǟ=�y�1}��#�^  ���/�'/�5��rK��>�mF��»�����S��n���_��M=23�[�O����c�JKhb}��kU �� @$�$���Ny#]/����+�i�P����z�s���~��rm�����k�jH�  "��B�!�Q�{a{!����~!���f�+X�i=�#܎<��\n=��5_�ѯ������xk��3�7|�����[�l�ݶ�9����/ �H,�0j������J �ڑu+�Z��۔�*<p��w^��s?y�=o�Ş^�8qdA��������W�H^  �'_���XI&���
�vdoI������S��oϭ<1qZ�/;p�P�z}�f�� �h�B  �d(�BU�te���:�/4�8�n���ۑ[wlo\[���۫�7�/��m�{���S� � @$���ƦX��<l����L;�������Z�*��/~�����rkU�±�]�n;!�ѵN�A�  �zj&��p�*.����v��BcT��vK3�����7�7��ӹ^������'��
��E�
/ �H,��!_����L��9z��^�ŔeRoG�Yj�{�ͫG���K�B��  �-_j���J�87/4�im�"T�?�1^8��c�1���=x!  �^����ExaXe�L0M����q��ڕW|��B��  ����1��2�\f�B  �"��*+@;����F�"vp��f�B  �"�����D�
���fm2��]3d���f3��  �Ƞ�¨���YmƔ��L���d��lb3x!  @I�CF�Y�Ŷ�6x���S,�ZƦ1��  ���慡>w��	��~�U�k5o�f��>VM�C�b�  �Hb/5�֚Ɩ�+��nݼ���Z-z�~h�Sf3ā �8�omqfӎ��{t�-�O�,7ˋ��o��,��g�\z�uŬ����/��s��lb�X�B �Qf���-����ސX�R�a�vd��,W��Vbh����`�o���Î�� F���ͭ{��$d /��*B�³��{,+��3����  #˶���.�$d/r$�k1�c�:����o��.f0� �,�N��<�;
H� ^��Ԯ ז/ա�F���,X"�|a�1�� `d���L���5'eΗ�F��S�W5�38i��nb3x! �Ȃ��ķ�Y�D�K�%ɭ���8�՛�ߓ��#g3�� F���z�����`�k?#X���+�Y�Y���Lc3x! �Ȃ��t��_>N����`�e�b~(�:I����3��`���b|`�J�/,5)��QJ���`%
�e3��`��<U��0�t��Imy�X��Ux���K
��/�a����VP�t��-0��:�щl��Ģ�p� {�B (��C&�s],�7�����s�{�N6M��ED,J
��/���w.�hv�X��X+T�L65��+~���7��~{nev�Sy'bQjy��ݵ�yG�/������
	�r�����
�"�J�B�归����O���/�����������[�[xa�ٲ{ڿ� ـ@y��B��^��xa�f�P�+r�m���2za�'Kb�3�[�O����c�JKhb}��:^Xr^z��3/��T� ʃ���s���YP�7i�f���Pn��f�ud���B�-�vM����M;�w��eg��sϿ�!�\Cf�� P⽰wD��XY!8�x�V�ϓk�^����~���4�^�Z�6�H��˭ǟ=����?����x��o��Ʊ�V�ۣco����m�s&��3x! ��/��-�n+�-�M�i��R�_
�\�v�� R(8p��w^��s?y�=o�Ş^�8qd/ '�B (N�M&�"�ڑ�M��>��,�[;�7��a5�����oϭ<1qZ�/;p�P�:^ N�� P���G�Lm�9�)�����|/pp`��8Zwlo\[���۫�7�/��� �^ ��y�B_��dK���N�-�N:���PJ3�Nx�4K���~���]n��R8v������G G�B (/��7��;��{�-mQ�|�)]�l<(�C��������_�y�}�ړ�u� ��<8xa7k�yV�J�!���v����l|֋)G�Ժ�қW'�,#\\^��� �^ ��q����c��2�D���.7/4�i�4Eh^ N�� 0*ح"�-���W0*��)#	�o�°(����h2^ N��  #^ N��  #^f�:��Z��8�Rd%��l/Ki� �,x!�	K��J�?�+r>��ZBV�
*�&�2�R��ljN���r�s�sa
�G�B ��/�*!W�X�A�bC)㨜�H���N���d{��æU(��C�BM��
C�T�  #^XU��N��/������w��[�)�!��s2��4X9M0$/���L��uhs��  #^XU�^�8woD~�E��9��������aZW��y#��y�up��дQQD��m˭�䐼���L�r�a��B ��/�*��s��P�=A�P�5r���v<��Ur�SB����xj!-콭�ZJ���c?b��{~�z
�Ɩ2x! d���[�_�ٴ�.|��{K���f��h_�汼�9�����:�M]�����J^�ؑ��a��Y�:���`/�P�/�#T�,���m�/���tq��驳7��`��/�*�q'�@�/T�J�BQ�P�-�'b�RZR�&�R�\_�u�Ie_���I�W.�y���� ��7��9�w�/�*�vd%��f�<_��Ac.�BC�1���z���:nz�@x�C$3�}���FF�@l�{���r�QT����J�S���l�~�l�]/��LN�п���^9H���Q-��^��p/��q�D�΃���xaU1�;~!e���B�,_h[5 �)b�#����x���$�K��e�Ҏ �A�.{U�j<���Ns�3���5y0��Ԫ�%�C�\+N���?'��j�/4�E�1��I
w ���\���`��D���;bn�
�����_h�>gT	��5���wP���-�#�ٻ�1^����S ���\��b�/��F���wM�ѨI�
,'� ���>L�b�_�j3���n�'���J�u\��p%�Y��y�`T@Pr��m	��l4CN�I�E�
�
��&��a����o��ա�9_"��� �	J.p���h/T|2���G��+	�,U,�L�0��
e�I� � AɅ�.�����)�9e'���Vs۬X��w�_����Ok���E&q/M��D:� ��� �xa.x��J��:x���aza�<�F�]_����'����k{���PC�'v���� ��\�:}�L\�/���,�Q3����B�5�,G�7w�R��~&��~�PC�B ��0��e��:F�� 5�XheX����j��餔K���f��{�G?[����jؼ~����OӉ )x! d^��^vCy����Bej�Q��N3�GX�mG�5nIw�x�?~p����p��'_��ޗv��ӏ?{j�xc�"�G�
� � /̅T/�!_�WO˔%1^��l@���^��l3��ޝ��ğbgw{�/����lꑙ��Fx���sWZB��7]�H� � /̅/�i-�ns�N˔�b��B�˅�|a�ց�P��j5��[� V�.���o�T�-�޴�~w�Sm ��@�����e�p��y��PY�K)/�p��Zm2���+ͦW�VӬ�G�y@/���z��Sk:���_M���6}���g�)���o���%����m�s��k�@l�� ����=�F�9��nM\�v�^�thG�-�kA8_nSv����+�9xAX�Ϗ�����M�{^x��đq����[vOG\\^u� 	x! d^��^v;'l�Ѳ��Z]�0X����pmG���4b��D�^�������±կ��oڧy R/�,�sa��ޕ4��w�Z�in�'�ѕ�v`�K�v����Nn������#��<�<޸�|; ��W�o�Q_j�۶�ܱ�e�:/�,�sa��3�u�h��^�qD�TB^��_�Y$�[D�dD�-��f4t���kѪ�z�Pp�ݏ����˭UY
�\�tQ��q�pG�:/�,�sa���kht�&�}פ]�A��_���k�Д.
t���ax��P�����w:���wz_���p�_
�^ Y�.�Bc7�H/)��1�3�8�����S�I��g�u�7�NYF(�/�Wك@��˅�.{ϴL�*i�^�蜤�$�=���[����E��?�Xe�j {�B ��p���F��i������Nl�����v�p��G���t�������FlkW^q�4~5�=x! dO�\ಗ��o_̺��BE>�p� �\ಗ�n�ҏӹ�<���|���=�&��Y�B �%��&����K� �������fM�]4p.�PtW/��Q>ˏY�B �%y��ݵ�yG	�W5�Ox� �PE9�|���9S��F2e�1+^ Y�����o�$$=/�f��m�k�8/i'M/�b�#��c���cV� � /̅�޼����yG	I�C�t3SG�ګV�j����L����-E3�Y-�B ��0/��=��k��ZI��	���g�I�פ�tj�*a��:M?4�S�>���2��/�,�sd���c'�-��G��
�a�l���_��A�M�-��=�P7���_ �6�z�>y
tC�a̪�@l��W�X�E�ODkj�-y��@߾��~���6�O�q��r�� �x!�+�j$E�0���}�aJ}�By�H`���L,��Ǭx! d^�� �a:ϡbOUaRu����cߧ0 ����	>fe� �B W��t֠�v�k��*DQCx��,�N�P��а�v�Oa��2�� �x!�+�5]
R&p�l4�r$KRЩ:
�I�v���h�7xa?��>fe� �B W�j���Jt�!�o�E�Y�Y�jD�i^�=�{��<5������cV� � /pe�_MW�z�lL����t[U%׊9KN^(3��Y�B ����t��W+�v�O,f��|�,ˮ��G���a�ʀ@�� ���/Tw�'�l����Q�m�Pݑ�Ǭx! d^�
��� ��'�+�j {�B ��p ���� x����S��=�;
�x! d^�ʖ���o�T� � /p�7�>��|�Q@�� �B�l�{���>l�y�w P�B �� ��.o;!~A����[�=lym[����;�&x! d�� ���� �x! @�� �B ��@��  �/�,� �^ Y� � � / (>x! d^ P|�B �� ���� �x!@�XiL�5�]�Zp��خ��J*!8�LX"� �B������f[���m�3"��<�T��[�n��M�s�sX��ٍ�S��Nv���@�� r5�{���;2�׮�/�lg���h��&��Ϊ���>Y��g7Bm�����]��'^ Y�d���RD�O��sw���/���u
j52g��
*��b-��5����O�'�)�^ Y�dH�Q�>V�Bm~N~������Sb��yC�%$����D�V4�����	,��Ê�2� �B�0_���Q*g�ƫ�Z�-�-�n�S�Y%'�~�-݅O
#������h�.%�g%���
%�x! d^�!Z/�^�^�/4u�S�c��&_(y���8]���|P��U
É4CYZ�]EiJ� �B�я;Q*�|aȫ��s�٪5,�R�q^(�%5�[�\�OW{����-R�/�,�2�Ў�䥢�Ь^��#��0H:�%_hH<���ɂ	%Ө4u�B �� C����)��}6bc?�Y6Ѯ�d&
�w�_h�'�U�@��2�<�DJ���������V
�x�����a')ya�
�d-iG�
�dHV㑽^p���ɇ�5y0G��6�`�RrR�]O�������T�0>�ʸ �x!@�$X�$����%Dľft�i����B���*�ZC�`�_�b�����4�/�L�2�&_��/�('�Z�Q�&4$	@�_����+��U7$X���G�	�b��j(�Rxx! d^PI	��l�DN�I�E�{�h�}�	�n��Ѿ�E��9 )�� �	x!@���B�'�KL�˺��+J���Ͱ@CN:�� �x�h=�4���,ʀ��m�ba�Y�i�����?��JR�d3��T��� �xa�q��Xӛ*v(��1
/����Ƚ���Y�䴿}~�o��j�^ Y����&+�h#�A�QCw/�Z�Ͳq�~s�,�m/��gB
�7�
5��/�,�ˇ��*��+`^ao�5���ԳL6���#L�%G��l��;��a����Vf?M'V���� �xa���՟�.v틈���.Y�P͚0W�F��x���WگP����|e�{_���'&N?�����d!7�B ���ĸx���U�.ja����z��B[+�y�����M�)vv����ޯ�̦���-a���_^�1w�%4�>ӵ*�T� ��c��Z�0[/��Lƌ@��1.V+��h�P����z�s���~��rm�����k�jH� � /,1v^�HVo����5�F\���9��R�m�k/�ۿЏC�f�+X�i�@�#܎<��\n=��5_�ѯ������xk��3�ŏ��{K���:��=g��f��� �������[��z=�4k���?�pD~�W��v�vd�¸���6e�
�������O^y���k���/NY��?��e��p���U�x��@��%&f<�׀,{�ae^�*ˀ��̱�ڎ�U݈1�O�^�������±կ��o;9 /�,�K�Ӹg/.;ј�ܿ�TW�`���RoGn�y�y�qm�v@
o��ߴ��Ժ�m�c��Nu^ Y��g/��q�uJfԴ�Y�Ig���4K+^�b9�v��B��w?���.�Ve);pa��E��Ʊ�]�� � /,1/�+�I�/4.IgnMv�Fuh���
v��
կoo|��s/�~q���kO
���@�� �<�J�p�0z�bm����g���L���>K�{/�yu�Ȃ0By|	��� ��'�h�oG6���f�������c��S�
���"��s�2~5�=x! dO�QE��&ҹzoY�W��;��{P���aQ��5��������FlkW^q�4~5�=x! dO8 W���X�K�'�rt� �B WR��(�8����F�"vpO�A�5x! d^�J�_M�i�p��8�Zi�&c�5�Av
�za�A�5x! d^�ʠ��A6�i��1#����V�?�e�0� �� � /p%=/	�f�p���q^�Oh�buNA�5x! d^�Jj^ꂧڑ@�:��^��V����з�=Hp/�,�\I��	��֚Ɩ�g�grݼ���Z-�MX	�}PFA�#x! d^�#�omqfӎ������[�lYn���<6�}�Y��Oҹt��zZ7'��_ G��	��� ���tq��驳7�֠��Q,ʨ���n����v`������ 2��臑���9�P�1�a�3��7��93�s���Wc�]�=�5����	��� �z���(ʦ�����R���A���B�����m�c��C<�A~5��%0��Jũ�_'/�>�淕]�`
^ Y0�.8A��)����ŴҴ��d8K�FԌ�&d�؉֝i�3���=
���ҷ]LU��A�z[�H�/�0H�/�,�W��c���0����_\>R9I�<c���z�y���s+����;��Yj߾�H)S�L6�]��5+����k��ș	��� ��
J�Fepd4�'���%�Z��%q����|e�{_���'&N?����鋷����R���5k����/��NJ�լ����S��Q��I��M2
�� R}��/i;����r~�z���dV8s�%�����k=殴�&��o��%g�������)��O�+���E����$��L�k�B Ȃ%�`Q�'�
`��`�ɘ({����p����\(ๅ߮�\[��iG���C��Ԥ��jr��$#�:��V�w��9g�	�� ��X�
&�z�y�4�����!5fE=S���_1����5�M�`g���=g.��Ԛ����WSgo���&�|����M���ugĿ�	�� ��^n��d��4��Sy�������/�*6�thGn"��ǯ|��a�??:��W��6�Z�y���G��R���� }��:a���:���W=���,�c<sl��#{U7�ڜ�ޞ[yb�6_8v�¡�uĢ�p� {�B Ȃ4Vn���0�u)�7�s�BS]���!�к�`�x�����^��iG}�u�(5�>�� �`�'\�D��5�/x� #��̨iڮ���c��/�����w?���.�Ve);pa���uĢ�<���k��^ Y0��
���,_h\��ܚ�/���8�,l���7�7��ӹ^������'��xa�ٲ{ڟ� �B ȂA���
//�^�X��s�B��4�r�u�7�NYF������K���ϼ<�wP-�B Ȃ�Eߎl�a�HG7/4�m���xa�ٶ���}�"אx! dA���\�$���z�����o�°(��:�E���`���c'ĭ��G��
�aK�m�s&�;\,�B �%�� �^ Y���� �� �\��x! d��\v p/�,@Pr�� N�� �J.p��	� � A�.; 8�@x�2}���g6�3ۀ��E��7��}��L�� ��Q�]ܲ{z��
y�6*��	� �`�
�A�����i��E�]Vt\���P��(x! d��c��yGQ9����ҧ�{p�S��:����I�w��l�ʊ��:GXkZ^)� �^ Y �u�A�QT������[����'��7�~��M�@"��|v:��dTyi�|ot�B�l-O0*�� �n�eR�Bok����w�F	��:�e�'I�������D�w��w��FM���m������� �xa.�����x�o�Y�al��*Y�y~�?DSY��a�D����e&qGI�B(�����䯟�y������W�w���N����t[��\H���_o�lb���n���/T��L����0��K�Q�b�0���P,v<����Yn��T�����saX^(�?�W������	?u�=B�d���M��fM�{�<�8N#^��'�	���s����;d�����[#��w����SO�<iY/̅�x��;���]�.n�P&w�. ���v++
m���~��d|�By���x�lzk�N /�� lCx��
�"�X ��~���S����޷9/̅��ж����"���bޘ@C�9�܋�в�Ў�D
�"��P��ﴐ�]�&K���S��-��j��^��y��pK'��
&���
�/���^7\ۑ=�lX5u3�!�x!�B2N�����к��xm�s!/���b�����I�^�McuQҧ��F?9��u+/��8�f���BQ�z޽�yށ�^/C�#��\�[����q�Ⱥ��j$�$N5�n��P���ݽ���Jpnk� �����yGn��5�0����Yi�#L,��?\�F�>���/4��,�@3@���(��e/,89x�����WA�/h�^h��z1e�R�BQ��^Xp2nGk��4Fݼ�<�5)B�x!�����gD�ж6��/ �K�?!T��^XF��e '�B(
xa�� ���(�o���o�:����_��dP�� ���(�텟|�����~�ƿ�kL��sy���c�Ѕ'��l�:<���S��=�;
 (
x!�Խp�S.���f�[���8�K��a�	�w"C$އ��\���Y#^X�잞�x+�( �4��PyaG����U�n)�L�u�>����ȵ�g���N��]J���I��Q/�/�y����� J^E!/��I�0�(	�7��>;9si�_�
�;�@����E�16���1$��6�
�M��Jl�{���>l�y�w  P�B(
��B}T�F��Z�;�zi?���u��^G���<p�6��V�}S�7��|u{+���6��uϙ��?�x!�,���L��v=�x�6���!eT��O�q�I��ƶk���l	� ^X^�>���]�AE������ � /����z�8Ũf�w�4I^�$Y��B�2��͋����S�R��ţ�A����{�oE��� �B(
�xaW
�"l��ya�;`/o����NZ\Db�A^;r����Vf?�w�E/�0x!��^�Q�����0�c~��B^(u�S��޷��>w��<5.���F�/۽���~�]�}i�/��8����6�7�IR�¢�@���p��&��T/4I��A�$���?�5��ESnG��o�\�g.���zy��ܕ������u��x�� /��0�vdߴtN�q��,*^���l�;<�J%v�xNc{��S�_��yi1C/\���P�s�]S��|{ӎ�ݵ�xa�� ^YS��9u��đ����9�mB��֩��Gor�BU(�+�,�g.����_�����a�-3�:��f.��Ԛ����W��E/�0x!���O_z��~<�iG=�H��Q��X/�J�e�=��,��Ow<r6^(
~�/�����~t�'���m���տzϫ����0� ^�b�썱y긬�ϭ{�G�8�p�ݏ��7���Gmo�y�6�yj���(��z|
^8s>�����	���=����im�P|
կ�E/�0x!����[ϼ<//��iG]��Ko^���Da�PMF��X�K*1�vd�r)уi���Z�΃��k˷Rx{���,���E/�0x!����[vO�:8qd!�e2���Dց�/����}ӭ�)�L��gL#_h�,ݡʒ/�#rD��~�����rkU�B�O��Gہ��E#���kW����������k}u*w��R/�8T���|��Ͽ�a`Nc��¥��
"&/4���&�oI��y�a�q�Sަ�k⛰y��ݟν��ŝ���=)\��G��������O�7wGo��?sw������B��a ��7ų�O���ջk�U�������E{��ު�-Ֆ�#c' Ԗr�b��4���!ԥ��'
�@�&�At#|זZ���`�Ȃ0���U?^X4"���?�o럜���G�m�~/̞�޻�G���_K_���T���C��*�(�$/������g|#<T�>`��ya�k_#��7'e.��Ώ�ۑ�a���q���"��5MhNv�I�S����n1����%/�=������s�N���~�kҟ�wo���x!@r�BH¾���@c��u��L/Tg�	$�̍��9��/�2��|d�8�^˲T�q�C9��04�N�X���(�Z�����/�Ss@;��M
�����K�{����D�[?��Us/�Қ3a���^��;_��}�ɿ���!�
4[G�ޚ���x�Y�4�%hM��K�ޙ�v����N������^���Iɿ�v���z9?��K}�^�)�$/��.{�<��I�:���#��g�>hH���P.�]RY�˃��D'�Q���G�j��3�	Z������t�v����������9���!g/<9�8��+|���_��0�8^��ly��y���=�b��'����/�.v�О�Z�����k��%��2��3y��Ҹ�t�r0O��d\R� ^X^2�l��B/$_00x!�sw�7�䑧��ӎ�N����Kn���#wJю0L�B��u�7[�Ʊ�o
�Dxa��Kǝ�I8�D�$/�(�W��	7�ۯ\�������d��ȹ@�x!R�b���3����2�����#w7ebj5��<�u�5x!�x!�"�Ka�΃Έ����D�G>|a�f{���c��ox!�%x!h"(t0K)\��	^X^"�p�6�����"��xa9��^ a�BP���p�3�K�:^XN���@��ɫ{����jƧ���)a�C�
R�w��^XR�B �B��G�ɫg?������0����ٟ�qz~Eܲ���Gm��^ a�B�rlv�[�n��\�ϵ�d|q���o�� ���Γ�}{�i���¢�@��,.�>��q���7u9�0���^��>��ÀX�,}���֝</,x! ���=��[��[?��7aB
��l�����w���3[�\��h�� /���#♽y�!1�X����|�����O���~�"�/n�z�?�����������l���}��^Xu��7��&�C/ (>xa�i�y�-v�o�B�x! @��+�؁�i�uϙ���/ (>xau�[����*^ P|�rw����-Ȑx! @��+�7����c��
��  �/�"|��7�5c�!3�B ��V�m{ω��3/��T� �����c��
�~�铭;�*^ P|������#����.�T� �����B�7�$�@�r�� c�1���Tv5k�=V�b�&+���P2aQ�/�w�>��I�x�:{#�X�r�� #,e++Ͷny{۲gD.y���)��2�@�F���|"Qʬ���u';U������>du�� CB���
���wG&��u���S�Q���2o���"|�d��n�ڂ��9��;�<(^X�Z���if?�;�"x!@�(�*E����:wׯ.��"\o]���P#�oΘ�r����'V��xr�0(��J�>5�d�L��*웺,��_��;�(x!@�����p�ce/����7ۯ��oP9%��7�]R@��	�kl�S��a�da��ɿ�a9���J��,<6��w,PQ�B�0_���Q*g�ƫ�Z�-�-�n�S�Y%'�Bf�Q�u�Q������(
֥����2R�b�V�!C��� ���腎�BS_>�<�xl�f/Դ������*����Q9�f��5צd�p�a2� C��NT��%_����L�b������/����ˠ�K�OW{��&}�	C�p�!YE /�C;�����B�z
�/��VC��3�|�!NV&�-�|L����G���
���;x!@��J�S���lL�~�l�]/��Lډ�C�Bk/t��E8a�R��±�e�<޴��w Pu�B�1�;F�}'-/�q����U�u�����a')ya���d-iG�����VC�"�dHV㑽^p���I��5y�F��6�`�RrR�?/�Fۘ��שxa|n�q'0$�W��������<�;�:x!@�$X�$����5Cľft3i����BӶ�*�Z%�� �u6�+��`^_�yj`X���c�y�d�M�0�;2_QN*�5�F�&M6hH"�z�\ч�W���np�Z��u8(��y���,���,��4,|E /(���ra66"��ڢS��C��Ƅ`�@�h�����K^��9 �{�d�pdy�ͫ�I�mﹼh��h/T|2���G��+�<�&k3�s�I�pdٲ{��i�8�� A��p�2`��6۬@�d3��TF���䃏>��Ǟ>�w  ]��2��Pr@�w"Wz��QgP�c'6�4x�h�8y����^XN�N�ƃ�5E���g酆#uK�:z��m7��x�( xa��;VY4n�
')���s�,PQ��l4B��G�V2+(��ߞ[�?ڐ;x�2u�"C��K�U�'��^������ 7
�!'�*�Y��+����Wv�����|b���Ϟ�<ޘ�x+�h����#k�@�K�Sg���k����N��%�`s��-a���_^�1w�%4�>3����$�»kŷv�ȂP�ɒ�-v�8vb��s�kslv�%X������x��gn�%!T&66T���By0r���e���B�-�vM����M;��9�[dPa�x���[���K[�7��	a�����l��K����VZ��Bu]ʹ��*������~(��4�^�ZM��Y��\n=��5_�ѯ�Y��3w��3����>:�V��g+¶uϙt���^�o�r�W�md��HV�
xay��v��b���ڗF(M.�;^9:Q;�n%�<8p��w^��s?y�=o�Ş^�8qdA��������W�*������D�8v♗�_z�*=d����Oկ��ڔ���o(&xa���B��6�f��h�=�1!���k;�7ƹ3�$ ���������B�of�_���M�	������g����R���Ѧu�����u���;":xa�I�����K%�48�s�BS]��sX���/���Ƶ��)��zӎ�x�n�{��6�1�^xw�ߧ��@*���G�:N�ȃ�g/T�"xa�X�x/T'�ѯ���5
GV�04}v�~�����rkU�B��foB��c'�ic�ޔx^�1�BH�/��{�o�r���p�K���Y�eM���5+��wJ�����FŔN�Ns��_�<���O�^x���C���,c�j {l����>������UF�D�{��ř�c������z�gvB���(���+(U1�vdsM֋)g�R��Ko^�8� �Pn<�W�c�����߇��x�A��]���^m�Q�;.<�F����%�i�����<�u�)B[��@��z�Ʊ�����>j@P5��'yÅ[<�4k�E���5���n���^�1�F��EQ�.�Yj,�W�c�<�aH�ժ�b W���ĬXZF�s�^9�W�"p�\I�W�rn?W�G�"vpO�d�
^9�W�"p�\I��ѭN�i䏓��fM3�(|��d��5���X'm�������3|�*���A5J�j@�³6�tՉ�Z�2cQ�|�vP{������3|�*�����0dK�%^l[c�����M慝Hc�e�
^9�W�"p�\I�C��t�4�SG�ګV�j��ɊLX4�ڭ=3��Ui�B��Z�[�J�_M��֌0����<-�����j
�Jh�y%#[s3�\�/���U��92}���g6��?7�=:���'[������7�
r�m�o~�ͥ^W��	6��	7W/�r}�����g���*^9�W�"p��b���-����ސX�R0دF1�(=�R�����[=�6�:�/��v_���b؟�����3|�*B�oq�G��B���;9Q���uϙ���@�ɘ"���o�����1����`�����X�0��UU�B��Za�[,�"2˔��}Ln#�=�n�ix����ٶ�ܱ��!� �� ���oa���Ӗ����ﯓF�'�Oa@����}���B��ժ��v����Ѧ:��j��o酆#u�a8z����e7��h�y�Vm�1�j:�m=�Oq#z��,�0_��k��B�Pqd�������3|�*B��8:�&+��xz/�Z��zp9���j��$�?49G�yl�O����oϭ�.~*��Uj߾�)�L6�]W��)����k���z4xa������3|�*B��8��a;1�����4t}O�/�h�J��W?�ʮ����OL�~��S���oyo��*5�o_��[���ҵ�r���Y�}G�o�5��Խ0n5��_w�������3|�*B��B}R2����Y����#�Md�3�[�O����c�JKhb}��:^Xr��۟O&Զ�϶+�~�%��9KV^���*x!�_����-���>�w3�/���+lF��B�Q&=�Y���P�s�]S��|{ӎ�ݵ���JM:^蛖n;I�F��Vrq�tٕ��������
^�3��;�,�|��2�,g�jU�o���r�>���i��Bu�4�L �������_(/� �Yl6���"�<���z��Sk:���_M���/�Ԥ�/Tw$(�jƃ�4�f�/Tw����J��pi<֐:�;�8upɥ��|n���5t�<2�#��<�[����	xaEH��'4���n��05�\�w�aP�C;r�g����+�9xAX�Ϗ�����M�{^x��đ~Y���ك�� ��u�R��5,]z�%x!��4�s�m��!Ҽő�����I�͉�Jb��^:��ڎ�u�lX��e��x{n剉��|�؁����e�nd^hE���sx��YFl����gs�G_
��^9��-��c���"�J*0*/hp4������4�I��<�<޸�|; ��W�o�Q_j��Uj�}�=x��o����NtO:�^/���m���/��)_��]xa�X�x/T��k�/��5
GV��v����w?���.�Ve);pa��v��R��S��=�;
�U�BKis�d��L'�h�n���]���^RsC|k5^90�-,n����/`��_�ԡf���N�Rs�S�Ш���I��8T��y��ݟν��ŝ���=)\�KΖ���T� ـ�Cc��m�!'�ޒ��?;y���}��t�J�`�r(4^X��j^Nɨ�V#�Nuʽ���3f����R-�Ժ�қW'�,#\\^����*5�>��|�Q@�(�v�YF��5�j�P�ri!K_
V����40e���x!�n��ҕ��]���9��=�.����m��_��E�!3��!ya�t3��4m�B�
�����F;2dH���HV�Iv���Gi�L+m����M^E9��.��/k�7uy�؉���ѱ��˟m�m�3y)�H�P&�v����խv�ԝ��Z�۟�}��r�[�\v p/T�P���m�ib���Ī���x!��8�� �^��:ڛM�~�����x!��8�� �^8@;���1�=wh^�FRm7^/����ز�_ 8Q*/�9��z��y�[�ЖX�Z��`�vYC�r@�bfb�~Y �DY��?�ֱ,�#[�(!�����e
p�^��З���G⅐�3[��� '�ᅲe��qg�a��������3[��� '��Ҡ�%ʢaP4]������Y�JOe�
xaE�n13���Y^�/|�X�w �D1�0�aEw"�)]3mY�#���P<�Ź�e '
�]��xI�㑣VIq���Ĭ�0��&P��Vnq.dw�Ck��V�i��vM�5��+�d�?;��/y���^O��r
��ێl:���b�^X�Ź0�e�-�g�b_���%OW6
/�V�
� ��^(���}�� �f<J^�K|F����#f2 /���\����8���T���Z�O��{���q�_'�� ���^��OcL���8]UCoG�-��A���e!OS�+�8���u���[�F	��=���F�&�������# �G���<��<5�)z:�L��Ϣ�u��km(m�V_(�e/���\H�����^%S���(��J;r���)��E���gKv�Θ�з+���
����?{\;�߄mp�H�믕��H��"p�s!��n�/�z�MN����
�\^�c�v�oٶ���o�u�˸�[�c�c��5�.o�2xaE��B���K����l�љ3z}�����+�% $��^�4�$��������C������F��J��N�=8xaE��BZ�=^���Nl��d|�BCE+ͦW�V�� )Qe/t��C������^:P�}"�m�
��-΅4.{/�=���*U�'jGn"� )R]/tlD^OmYaM�Z>E�0��Y��aƳ��[��^v;'l���܆
�vdo�K#f�I�� \(��z�Ŷ��{aD�-�D{���86��<ib��%�Gf8/���\�w��N�4��ݿ00����	Z��zap4qL�f"/�)bԜ�^\�M��6Wj�[�3&�2�h�Vnq.r�c&��-��+e����䅴10���4Y�B�d: `I�P��PI��&i�� �Ԗ��i�rm����)�#^|�T�]��-΅.{�4���}���q�B�]�Д.T6 V��Ah_���ڥ�반�2r_-��-΅A�����BmZq^h6>�Ŕ ��zavx��z��H�-΅�.{Ԋ$=Et�B�֤R/���U�Ź���;��R�A���°(��IB���!g�jUnq.p��	�r��VE��� ��!g�jUnq.p��	�r��VE���#O���0�( �4���3|�*�8�잞�x+�( �4���3|�*�8^z��3/�� ��r��VE��Ŷ����֝y % /���U��9�o��Ʊ�U={+��g���{��}g 
^9�W�"p� �^9�W�"p� �^9�W�"p� �^9�W�"p� �^9�W�"p� ���>��q���d�.�W+�@`�p� ���~���x�c��C
*�R����8v"�X`���  ����_mz��}S��T���7��ն����^ P|l��P��������avH�o�x��^�x�� ���z����l���Pc��p�ݏ�A'���y��%k/\iL�kC�l���7k�z�����=��R
 `��z�zg�u�.�P���b�*plv�_�k����Á����mjW�xu�K8������4j�ݝ�	_�[^ح��P �Lp�B��=g�϶����7�N�]{(�6B�/�cO�\j��;.:iyaW�6�~�3��d\�0�����h�EQz��͆�  �態˫���/v�V����o�N0½"lH�}�J�]t�SF-0�hԤ?V�U�"5�( @�p���N����>��0�F`�֏g�V�
)x���kD���/�1֒,_خ�k'W ���=�/�v�uϙp��-z_�g^�'MX56셽Fި^y%���B ț�^Y2���x�n�Q�;���}
/�k�qB ���xCw��e0/�]���Ͷ�{a�6߿�/�z�J����j8! ��l�{N<V����;������q}���3�A�KԎ�D
�P���`����2������yadw>�����e�l'K�֎,����O ���A}���"�y���^��	�/|�bf��z�.Ø^�BS@��=�D '��rpw�7��ũ��>��U�0z���]���y�j����{M)^�W  k��Ұe�����24/��L��3)��yX��K%_h�_�G'9 �^X�_m�'�đ��HB�^�vy���6-/4��b�  �����7�I�� 	�ya,}ɋ�XY/g)y�9}I� 
^XZwl�,1�w  I��m�!����-�#�ƼDxaXea�?! ��L|�����y�L��B  H^X&�\��G��� ����e�P��x�n�{.�@ �� �^X&�Z��.��b���- @��K��ŐY�tl�==}�V�Q  @xa�`C()/�y�����  ��K�7����y�̶����֝y  z��/����Ⱦ���N�/��=:�V`[��� 0���!��0u�Fށ   �H����#��_e�   H��|��o
/ܴ��w    0R������C�����jޱ   �����/�/<T��w    0:���d��E�c.�   �xa)�]�Tx�Ʊy   �^XV6�5da1   H���<�����_�0�@   `D�ˊ7[���Fށ   ����f�  �t�K̷~<+�p��ż  �Q /,1��ׅn�s&�@   `�KL�΃G�:.�P��;   (=xa�ٺ��   @*����[��[?��;   (=xa�Y\^�>���0�X   �����g�xC����  �r����#��yy>�@   �����g��-��  `p��Q`ӎ:M�   0 x�(��k
/;p!�@   ������}FS2   ^8"x����qށ   @Y�GoT2\  @b���kJ~��4%  @2��с�d   �pt�7uYx��g�   J	^8:xk%?���֝y�   �/)��jx�~=�@   �|��#����4%  @2�b�u�5/�   J^8j|�ǳ�'�,�   ��pԨ��^�iG=�@   �d��#�7����  �2�� �>  ���#�7�Dl�>   {����}�o�rށ   @i�GF� $�Y�l���ZiL�2��ݵ���ӗ	���c,��(xB ��GF� ���[�ᅦ�
^ؗ3�j�.]{a�D�� X��,�>P�HT��[��t���]��$�{� 2���,!� ��G�֝��'����@޴���Z&�=)�.�׽Ygr���w�ѨI������� H�p��)��[?��;��`�z�^h��#U�$�������
 e��Q�	k ���J���}�&��^h  �3xሳ�ř
�����<* :Dy����9G��[��j�����
��t���P�n�8! ^8��.~*�𑧎�]{�w, �&_h��vꓺ�����}/4�}�Zm2��_J�f�+��Q� R /}��='�p��ż( i{�\o�M�H�l/32E�v�&R )��>Sgo/|�铤R�B� ��q�Ik䢞B6\ۑ;g�5b��� p/�_��;B
կ�@�#_H�)������N�@R��J ��[��!T����3?e�qp���Ժ'Q�����-���h��"�� ���|���2�y��fj¯?���\�L\O�l]j�¨l�YJ ������{a7ig��R�/��k׬Y���c� H��Bx�IDcJ�E�/��k�
�����sZ�"��+)C �]�b�/��N*�_9X*�â(�K�?! �^X-��f�   ЂV�VL  � xa�`�d   ЂVR�   �/�"c.5���Lށ   @����R��ƱB
��.�   ������UV�   ���x�\OY�; �/�����'����ۣco���l[����f@����? 像>�; +�]ܲ{z����ռc A��J����B
��=�w  ���o�� *xa�i�y���'�~��c�A���R  C/�:��׽E���
�Ʊ�_2yG 0�����u�Z����oi�!  �8x!��3�Z��]�; #x! ����M}��76y�⭜#��͟O��ɝ'�����Fu���N|{����W��x! ������}��L׻��]Yز��x����5˯^ 0l�B�"tp��i��;p!� �|�מ+���9W����.@��{�sqſ~������Γ��B �a�B���Uo��޼��(E� ^d|jȋ�~���S����޷9>;/\iL�l�8�hւ�{���Zk:
 �2x!(~�c��a��}{�i�����;꺸���O��<�
=��0��/��+I��s��( @�����h�q�D���	3~pz�Gb�h�^���6⅁`���/씗���UM��," d^��8�A�l�k�g����gs:(^/C�#�����N9:��{;N���d�Q��X�ѯ�����ʗ��N6Ó=/��DP4�o}��;m�a/f�<��X���.��,_�>dC5�B ���,��m�QO��/�dp:�����Q�B��_T{� �c���b� �-x!�]���<���Nxae���$]��V&[]�u�^(F��@���ű��G�:.��ϼ<?�ᅕ%{/�Ӯfmr�ݿ��Q5{/��&���E��+ͦW�V�� �x!���؁��k�V�l�����\ktǝw�zZd;r�RE��#7�B ���������=7$5�+Kv^��3�5���q�Bo�rõ��҈t�� �^V�}
��9Ӻ� ��G��8�;�8upI�����bO����R�X�^~.^~'�����	r  �^�,.�z#�7�7R��z$�����w�qް����7~a��"�|./S�v̜߄'�H�k���Ld�?�sL���#���h�/��5
GV��0� ������B
���կ�XsJ^�1��
E�Z<�o�r������_zR�ܥE�0܄�;�!�CEe.���.Zɼ0r�������+���/� 0 x!�qw��؁�	-�o�x6�6����S��jn^�Q����4^���^؎\{:q��Υh�Ҿ�R�x�/�{�e�f�^L `������~�u7�<ޘ�xk�
���1:	&%a�&��g'g.����O�xa'�y����;�f��q�2�D�}�6Dd7K慎��sZ�"�|�!!�˫�Zy�������=7�؏���Y��"ya���Q�^�;�kA�����;2׭�{)͢�'\:��nV��ʴ�~*2hs^E�_"�	 G�BH�ݵ�Ͽ��'7�N웺�x��yaۙ���zR�$mv�Cʨ6m�|�ԓ�'�mז��\�"z! @U�aP>��m{�yZ���'��q�J�Վ����9���pFa��)ڞb�Y46w*��c�Ԧft�(�B �j�B:��o~���xr ^�_w����R�霨�Gw�^j����v�K�a'-."�� ��y���s+����;�B �a�B�|��~��؁��R��B]CsۍB^h��1��a�3J�,���{��]:�8O�˼6����n6����_��+�����_>1q��gO���B �a�B�~�c�eyCg��đ���7"Ʀ���Q�!a�<L=�I
�w
'��W������.�2p;rO#�r8^8s�%�����k=殴�&��o��  �/�a�����kzK�����[?��7uY<��毛���1%6�N�&dՎ웖��:.�=�⅝Q�V��wx>8�7�J�������ҿ��	��b�^�z�s���~��rm�����]{� ����#[���<�nE���T`-w(T�R�2�Rx�B?��΀���M܎��2��C��~�r��gO�����~5u�^ 0l�BȔ>��������m^�"�;�I��zaxU:/#(�эe�D�㑳�BQ�+��w^��s?y�=o�Ş���{���餏�����m���� �B!(�������&�v�@)��S��ї���L����'&Nk�c.�_�@� `���PF��a��u��SiG�,��=���ַ�<�<޸�|; ��W�o�Q_j�� �
^��|^؝�:��tFo�v�nm��!ΘF��tY�]6%_G��?���_����֪,�c.�?�/ 6x!W/�P�q'��ihi�����
o)gT���O�[E�B�p���M9p�կoo|��s/�~q���kO
��B ��B!(������E{���I���	�����>�?�vu�d�I��д	g����ֽ�޼:qdA���/ 6x!��#�'��51�}sR�y����Ұe���8�nx��&4';�$�)�
�vk��`}d ��B!���Yf�0s#�gN���La/;��ײ,�f��P�6/M�7֤�>J��d� �8��P���~+�9��-/|ƾ��2�o�'��V�L+�l�zk��~`��F������5/ (x!��ڑ�1Q��L�
���(�.�,����Y����S؊��5�������x! @q�����"�Q�؝B{�k�K�{Sl�W��^�xL���KK��%��<�ƒqIeE��fm���k�1����Wv׮Z3�O_&�F���&��	  /�B��B�������(S+�Mo��/g�jv���;'�< ��
^XY2�BaZ}=��٦:okdΜ/�z�'����	=w/��6�� ��
^XYriG�K�5k���t��ڑu&Wk�{'����J�\���# @J��P��ʒO�¶b97��Д�G�"H&����X-�B x!����/t֧�|a�����&��^h  �3x!���������r"��e��<{�Y�w|��^�މ��7�ʢٍ'������%3/��/N�Á��ByKOܔq���B#P�'��&����T/\i6��]�	 �B(xaeɣ�#R.^(�~�/(ۓԐ):�#�}  �B(_�>%�`v�Vށ@����a�I�d/4�כ�F.�)dõ��وt�� �
�
��>%����Bށ@���_�����Q��S]���ǰ��S�0��S���1~!/ԝ><�-����P�s��_�>��ۻy����Γ�{�i����/왟2�88�Dw��I�|�v�Bit��d�h��� �BQ���Nx����o��Ε����ٺ�?�BaK��Z(��&��sI��erɞ6�ٺ��Q�J�� 8�BQ� ����6��?����8~�c�o�`�B5/�H���I;;/\��|��]�fM~��c� H�
�����:x�_����۰�/n�z�?���m ���Q�R|������r��A5t�B�֤ E�B (Yy���^������Ie��#KExaX��'�	 -�B (�� *^ � / 6x! �� `��� Py��ݵ�yG 0��� P�잞��J�  C/�r�қW�yy>�(  F� Jö����֝y 0��� P&�M]�8vb�7~!o������m�s&�	 �/   �6x!    ��   �
^    m�B    h����fER8    IEND�B`�PK��Pfh  ah  PK  7�Q               META-INF/manifest.xmlc��<?xml version="1.0" encoding="UTF-8" standalone="no"?><manifest xmlns="urn:xmind:xmap:xmlns:manifest:1.0" password-hint=""><file-entry full-path="content.xml" media-type="text/xml"/><file-entry full-path="META-INF/" media-type=""/><file-entry full-path="META-INF/manifest.xml" media-type="text/xml"/><file-entry full-path="meta.xml" media-type="text/xml"/><file-entry full-path="Revisions/" media-type=""/><file-entry full-path="Revisions/6efkjpakvem8dhcuogog58m3e3/" media-type=""/><file-entry full-path="Revisions/6efkjpakvem8dhcuogog58m3e3/rev-12-1598801625999.xml" media-type=""/><file-entry full-path="Revisions/6efkjpakvem8dhcuogog58m3e3/revisions.xml" media-type=""/><file-entry full-path="styles.xml" media-type="text/xml"/><file-entry full-path="Thumbnails/" media-type=""/><file-entry full-path="Thumbnails/thumbnail.png" media-type="image/png"/></manifest>PK(���h  c  PK   7�Q�-p��  �                   meta.xmlPK   7�Q�/˶!2  2               �  content.xmlPK   7�Q_s�4  /  
             4  styles.xmlPK   7�Q��!uv  q  2             �D  Revisions/6efkjpakvem8dhcuogog58m3e3/revisions.xmlPK   7�QQ�5`!2  2  =             `F  Revisions/6efkjpakvem8dhcuogog58m3e3/rev-12-1598801625999.xmlPK   7�Q��Pfh  ah               �x  Thumbnails/thumbnail.pngPK   7�Q(���h  c               ��  META-INF/manifest.xmlPK      �  C�    