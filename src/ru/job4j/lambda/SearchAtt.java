package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getSize() > 100) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getName().contains("bug")) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> filter) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (filter.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13));
        Predicate<Attachment> filterByName = attachment -> attachment.getName().contains("bug");
        Predicate<Attachment> filterBySize = attachment -> attachment.getSize() > 100;
        List<Attachment> attachmentsByName =  filter(attachments, filterByName);
        attachmentsByName.forEach((u) -> System.out.println(u.getName()));
        List<Attachment> attachmentsBySize =  filter(attachments, filterBySize);
        attachmentsBySize.forEach((u) -> System.out.println(u.getName()));
    }
}
