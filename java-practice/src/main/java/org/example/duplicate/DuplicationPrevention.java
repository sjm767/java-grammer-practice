package org.example.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class DuplicationPrevention {
  private static final String[] rotties = {"img1", "img2", "img3", "img4", "img5"};
  private static final int COMPONENT_COUNT = 9;
  private static Random random = new Random();

  public static List<Component> createInitComponent() {
    List<Component> components = new ArrayList<>();

    IntStream.range(0, COMPONENT_COUNT).forEach((idx) -> {
      components.add(new Component(idx));
    });
    return components;
  }

  public static void refillRotties(List<String> list) {
    list.addAll(Arrays.asList(rotties));
  }

  public static void main(String[] args) {
    List<Component> components = createInitComponent();
    List<String> rottieList = new ArrayList<>(); //이미 사용한 로띠를 담을 공간

    String prevRottie = null;

    int rand = 0;
    int tryCount = 0;
    String currentRottie = null;

    for (int idx = 0; idx < COMPONENT_COUNT; idx++) {
      if (rottieList.isEmpty()) { // 로띠가 비었으면 채워준다.
        refillRotties(rottieList);
      }

      // 랜덤을 돌려서 앞전 데이터와 겹치지 않을때까지 순회한다. 단 무한루프에 빠질 수 있으니 5번 정도로 제한한다.
      do {
        rand = random.nextInt(0, rottieList.size());
        currentRottie = rottieList.get(rand);
        tryCount++;
      } while (tryCount < 5 && prevRottie != null && prevRottie.equals(currentRottie));

      // 로띠 이미지 세팅
      components.get(idx).setRottie(currentRottie);
      rottieList.remove(rand);

      prevRottie = components.get(idx).getRottie();
    }

    components.forEach(component -> {
      System.out.println(component.getRottie());
    });
  }
}
