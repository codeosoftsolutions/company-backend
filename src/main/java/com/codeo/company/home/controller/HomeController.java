package com.codeo.company.home.controller;

import com.codeo.company.home.controller.*;

import com.codeo.company.home.dto.HomeResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping
    public HomeResponse getHomeData() {

        HomeResponse response = new HomeResponse();

        response.setCompanyName("Codeo Soft Solutions");
        response.setTagline("Innovating the Future");
        response.setAbout(
            "About Us – Codeo Soft Solutions\n"
            + "\n"
            + "Codeo Soft Solutions is a technology-driven IT services company focused on building reliable, scalable, and practical software solutions for businesses. We work with organizations to simplify processes, improve efficiency, and enable digital growth through modern technology.\n"
            + "\n"
            + "Founded with a strong focus on quality and accountability, Codeo Soft Solutions delivers end-to-end services including software development, web and mobile application development, IT consulting, and digital solutions tailored to client requirements. We believe technology should solve real problems—not add complexity.\n"
            + "\n"
            + "Our team consists of skilled professionals who combine technical expertise with a clear understanding of business needs. We follow structured development practices, transparent communication, and a results-oriented approach to ensure every project delivers measurable value.\n"
            + "\n"
            + "At Codeo Soft Solutions, we prioritize long-term partnerships over short-term delivery. We aim to grow alongside our clients by providing dependable support, continuous improvement, and solutions that scale with their business."
        );

        response.setYears(1);
        response.setEmployees(15);
        response.setClients(10);

        // CEO
        response.setCeoName("G.V.RAO");
        response.setCeoMessage(
            "At Codeo Soft Solutions, our focus has always been clear: to build technology that is reliable, scalable, and genuinely useful for businesses. We believe that successful digital transformation is not about adopting trends, but about implementing the right solutions with discipline and clarity.\n"
            + "\n"
            + "From the beginning, we have emphasized quality, transparency, and long-term value in everything we do. Our goal is to help clients grow by providing technology that simplifies operations, improves performance, and supports sustainable business outcomes.\n"
            + "\n"
            + "As we continue to grow, our commitment remains the same—to deliver practical innovation, maintain strong ethical standards, and build lasting partnerships based on trust and results.\n"
            + "\n"
            
        );
        response.setCeoPhotoUrl("https://res.cloudinary.com/dwo42utuh/image/upload/v1770805662/md_t91yn2.jpg");
        response.setCeoPortfolioUrl("https://www.linkedin.com/in/nitinkumar");

        // MD
        response.setMdName("Deepthi Chowdhary ");
        response.setMdMessage(
            "At Codeo Soft Solutions, our priority is operational excellence and consistent delivery. We focus on building strong systems, capable teams, and reliable processes that allow us to deliver quality outcomes for every client engagement.\n"
            + "\n"
            + "We believe long-term success comes from discipline, accountability, and clear execution. Our approach is centered on understanding client requirements in depth and delivering solutions that are practical, scalable, and aligned with business goals.\n"
            + "\n"
            + "As Managing Director, my responsibility is to ensure that our teams operate with integrity, efficiency, and a continuous improvement mindset. We are committed to building lasting relationships with our clients by delivering dependable IT solutions and responsive support.\n"
            + "\n"
            
        );
        response.setMdPhotoUrl("https://res.cloudinary.com/dwo42utuh/image/upload/v1770806261/ceo1_hvhoyj.jpg");
        response.setMdPortfolioUrl("https://www.linkedin.com/in/rajeshsharma");

        return response;
    }
}