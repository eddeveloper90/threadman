/**
 * @author eddeveloper <ed.developer90@gmail.com>
 * Date :  2021-05-15
 * Time : 11:57 AM
 */
package com.play.threadman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("thread")
public class ThreadController {
    @Autowired
    private ThreadService threadService;

    @GetMapping("/info")
    public ResponseEntity<?> info() {
        return null;
    }

    @GetMapping("/up")
    public ResponseEntity<?> up() {
        return null;
    }

    @GetMapping("/down")
    public ResponseEntity<?> down() {
        return null;
    }
}
